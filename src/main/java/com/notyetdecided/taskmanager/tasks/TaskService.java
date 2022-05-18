package com.notyetdecided.taskmanager.tasks;

import com.notyetdecided.taskmanager.tasks.DTO.EditTaskRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    List<TaskEntity> getAllTasks(){
        return (taskRepository.findAll());
    }

    TaskEntity getTaskById(Long id){
        return taskRepository.findById(id).get();
    }

    TaskEntity deleteTaskById(Long id){
        TaskEntity saved=taskRepository.getById(id);
        taskRepository.deleteById(id);
        return saved;
    }

    TaskEntity updateTaskById(EditTaskRequestBody editTaskRequestBody){
        TaskEntity task= taskRepository.getById(editTaskRequestBody.getId());
        task.setDueDate(editTaskRequestBody.getDueDate());
        task.setName(editTaskRequestBody.getName());
        task.setStatus(editTaskRequestBody.isStatus());
        TaskEntity savedTask=taskRepository.save(task);
        return savedTask;
    }
    TaskEntity addnewTask(String taskName){
    TaskEntity task =new TaskEntity(taskName);
    TaskEntity savedTask=taskRepository.save(task);
    return savedTask;
    }
}
