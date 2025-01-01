package com.example.SimpleProjTask.service;

import com.example.SimpleProjTask.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getProductsByCreator(String category);
}
