package com.notyetdecided.taskmanager.Users;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER_ENTITY")
@Data
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC)
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(unique = true,nullable = false)
    private String userName;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    public UserEntity(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
