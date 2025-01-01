package com.example.SimpleProjTask.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "USER")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

}
