package com.example.SimpleProjTask.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Embeddable
public class ProductKey implements Serializable {
    private LocalDateTime productDate;
    private String manufactureEmail;

    // Default constructor (required)
    public ProductKey() {}

    public ProductKey(LocalDateTime productDate, String manufactureEmail) {
        this.productDate = productDate;
        this.manufactureEmail = manufactureEmail;
    }

    // Getters, setters, equals(), hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductKey that = (ProductKey) o;
        return productDate.equals(that.productDate) &&
                manufactureEmail.equals(that.manufactureEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDate, manufactureEmail);
    }
}