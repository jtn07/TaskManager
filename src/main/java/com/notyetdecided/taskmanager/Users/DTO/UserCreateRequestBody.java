package com.notyetdecided.taskmanager.Users.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreateRequestBody {
    private String userName;
    private String email;
    private String password;
}
