package com.notyetdecided.taskmanager.Users.Exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class PasswordMismatchException extends IllegalStateException{
    public PasswordMismatchException(){
        super("Wrong Password is given");
    }
}
