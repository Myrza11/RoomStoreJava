package com.example.javasecuritydemo.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usersNew")
public class User {
    @Id
    @SequenceGenerator(name="users", sequenceName = "users", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users")
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String roles;


}
