package com.example.SimpleProjTask.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {

    private String id;
    private String name;
    private LocalDateTime productDate;
    private String manufacturePhone;
    private String manufactureEmail;
    private Boolean isAvailable;
}
