package com.notyetdecided.taskmanager.Users.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddUserResponseBody {
    private String userName;
    private String email;
}
