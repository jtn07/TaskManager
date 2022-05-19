package com.notyetdecided.taskmanager.Users.DTO;

import lombok.Data;

@Data
public class UserLoginRequestBody {
    private String userName;
    private String password;
}
