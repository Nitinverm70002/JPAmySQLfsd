package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.roleName = :role")
    List<User> findUsersByRole(String role);
}