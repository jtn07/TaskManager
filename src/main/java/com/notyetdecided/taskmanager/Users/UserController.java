package com.notyetdecided.taskmanager.Users;

import com.notyetdecided.taskmanager.Users.DTO.AddUserResponseBody;
import com.notyetdecided.taskmanager.Users.DTO.UserCreateRequestBody;
import com.notyetdecided.taskmanager.Users.DTO.UserLoginRequestBody;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("")
    ResponseEntity<AddUserResponseBody> createNewUser(@RequestBody UserCreateRequestBody requestBody){
        System.out.println("createNewUser called");
        AddUserResponseBody responseBody= userService.createUser(requestBody.getUserName(), requestBody.getEmail(),requestBody.getPassword());
        return responseBody!=null ? ResponseEntity.ok().body(responseBody) : ResponseEntity.badRequest().build();
    }

    @GetMapping("")
    ResponseEntity<AddUserResponseBody> login(@RequestBody UserLoginRequestBody requestBody){
        System.out.println("login called");
       return ResponseEntity.ok().body(userService.verifyUser(requestBody.getUserName(), requestBody.getPassword()));
    }

}
