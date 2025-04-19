package com.example.SimpleProjTask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")
public class Product {
    @EmbeddedId
    private ProductKey id;  // Composite key

    private String name;
    private String manufacturePhone;
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public LocalDateTime getProductDate() {
        return id.getProductDate();
    }

    public String getManufactureEmail() {
        return id.getManufactureEmail();
    }
}