package com.example.SimpleProjTask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "PRODUCT")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime productDate;
    private String manufacturePhone;
    private String manufactureEmail;
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
