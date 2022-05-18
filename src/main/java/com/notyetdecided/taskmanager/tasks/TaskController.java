package com.notyetdecided.taskmanager.tasks;

import com.notyetdecided.taskmanager.Constants;
import com.notyetdecided.taskmanager.tasks.DTO.CreateTaskRequestBody;
import com.notyetdecided.taskmanager.tasks.DTO.EditTaskRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/tasks")
@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value="{id}",method = RequestMethod.GET)
    ResponseEntity<TaskEntity> getTaskById(Long id){
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping("")
    ResponseEntity<List<TaskEntity>> getAllTasks(){
            return ResponseEntity.ok(taskService.getAllTasks());
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    ResponseEntity<TaskEntity> deleteTaskById(Long id){
        TaskEntity deleted= taskService.deleteTaskById(id);
        return deleted != null ? ResponseEntity.accepted().body(deleted): ResponseEntity.notFound().build() ;
    }

    @RequestMapping(method = RequestMethod.PATCH)
    ResponseEntity<TaskEntity> editTaskById(@RequestBody EditTaskRequestBody body){
        TaskEntity updated=taskService.updateTaskById(body);
        if(updated==null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.accepted().body(updated);
    }


    @PostMapping("")
    ResponseEntity<TaskEntity> createTask(@RequestBody CreateTaskRequestBody body){
        TaskEntity savedTask=taskService.addnewTask(body.getName());

        return ResponseEntity.created(
                URI.create(Constants.BASE_URL +"/tasks/" + savedTask.getId())
        ).body(savedTask);

       // return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }
}
