package com.example.SimpleProjTask.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "PRODUCT")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime productDate;
    private String manufacturePhone;
    private String manufactureEmail;
    private Boolean isAvailable;
}
