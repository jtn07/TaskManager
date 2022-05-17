package com.notyetdecided.taskmanager.tasks;

import com.notyetdecided.taskmanager.Constants;
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

    @GetMapping("")
    ResponseEntity<List<TaskEntity>> getAllTasks(){
            return ResponseEntity.ok(taskService.getAllTasks());
    }
    @PostMapping("")
    ResponseEntity<TaskEntity> createTask(@RequestBody CreateTaskRequestBody body){
        TaskEntity savedTask=taskService.addnewTask(body.getName());

       /* return ResponseEntity.created(
                URI.create(Constants.BASE_URL +"/tasks/" + savedTask.getId())
        ).body(savedTask);*/

        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }
}
