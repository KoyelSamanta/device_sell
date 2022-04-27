package com.koyel.device_sell.service;

import com.koyel.device_sell.model.Role;
import com.koyel.device_sell.model.user;

import java.util.Optional;

public interface UserService
{
    user saveUser(user user);

    Optional<user> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
