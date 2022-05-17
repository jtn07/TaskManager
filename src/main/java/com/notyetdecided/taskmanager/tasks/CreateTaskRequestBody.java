package com.notyetdecided.taskmanager.tasks;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskRequestBody {
    public String name;
}
