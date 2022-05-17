package com.notyetdecided.taskmanager.notes;

import com.notyetdecided.taskmanager.tasks.TaskEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class NotesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String body;
    @ManyToOne
    private TaskEntity taskEntity;
}
