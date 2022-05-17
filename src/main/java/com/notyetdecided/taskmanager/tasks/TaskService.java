package com.notyetdecided.taskmanager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
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

    TaskEntity addnewTask(String taskName){
    TaskEntity task =new TaskEntity(taskName);
    TaskEntity savedTask=taskRepository.save(task);
    return savedTask;
    }
}
