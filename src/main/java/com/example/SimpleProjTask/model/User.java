package com.example.SimpleProjTask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "USER")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // TODO: Check for all fields that could they be null or not? (use @Nullable or not?)
    // TODO: Check fields need @Pattern or not?
    // TODO: Add security

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}
