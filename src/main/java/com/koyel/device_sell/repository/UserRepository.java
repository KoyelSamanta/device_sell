package com.koyel.device_sell.repository;

import com.koyel.device_sell.model.Role;
import com.koyel.device_sell.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author koyel
 * @date 01.04.2022
 */
public interface UserRepository extends JpaRepository <user,Long>{
    Optional<user> findByUsername(String username);

    @Modifying
    @Query("update user set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
