package com.notyetdecided.taskmanager.Users;

import com.notyetdecided.taskmanager.Users.DTO.AddUserResponseBody;
import com.notyetdecided.taskmanager.Users.Exceptions.PasswordMismatchException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private PasswordService passwordService;

    public UserService(UserRepository userRepository,PasswordService passwordService) {
        this.userRepository = userRepository;
        this.passwordService=passwordService;
    }

    public AddUserResponseBody createUser(String userName, String email, String password){
        UserEntity savedUserEntity= userRepository.save(
                UserEntity.builder()
                        .userName(userName)
                        .email(email)
                        .password(passwordService.createHash(password))
                        .build()
        );

        return AddUserResponseBody.builder()
                .userName(savedUserEntity.getUserName())
                .email(savedUserEntity.getEmail())
                .build();

    }

      public AddUserResponseBody verifyUser(String userName, String password){
        UserEntity userEntity =userRepository.findUserEntityByUserName(userName);

        if(userEntity==null)
            throw new PasswordMismatchException();

        if(!passwordService.matchPassword(password,userEntity.getPassword())){
            throw new PasswordMismatchException() ;
        }
        return AddUserResponseBody.builder()
                .userName(userEntity.getUserName())
                .email(userEntity.getEmail())
                .build();
    }


}
