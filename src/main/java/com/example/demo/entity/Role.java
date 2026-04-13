package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}