package com.koyel.device_sell.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * user class create the variable that are needed for store a user's information
 * @author koyel
 * @date 31.03.2022
 */
@Data
@Entity
@Table(name = "users")//not user => because it is reserved.
public class user
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
