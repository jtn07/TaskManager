package com.notyetdecided.taskmanager.tasks;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Task")
@Data
@NoArgsConstructor
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private LocalDate dueDate;
    private boolean status;

    public TaskEntity(String name){
        this.name =name;
        this.dueDate= LocalDate.now().plusDays(7);
        this.status=false;
    }

}
