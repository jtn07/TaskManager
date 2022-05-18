package com.notyetdecided.taskmanager.tasks.DTO;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskRequestBody {
    public String name;
}
