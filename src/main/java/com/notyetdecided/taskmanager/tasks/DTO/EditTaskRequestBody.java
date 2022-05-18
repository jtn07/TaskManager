package com.notyetdecided.taskmanager.tasks.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EditTaskRequestBody {
    private Long id;
    private String name;
    private LocalDate dueDate;
    private boolean status;
}
