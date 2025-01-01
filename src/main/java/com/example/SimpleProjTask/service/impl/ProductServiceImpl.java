package com.example.SimpleProjTask.service.impl;

import com.example.SimpleProjTask.model.Product;
import com.example.SimpleProjTask.repository.ProductRepository;
import com.example.SimpleProjTask.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
        log.info("Product added successfully with id: {}", product.getId());
    }

    @Override
    public void updateProduct(Product product) {
        Optional<Product> productOptional = productRepository.findById(product.getId());

        if (productOptional.isPresent()) {
            productRepository.save(product);
            log.info("Product updated successfully with id: {}", product.getId());
        } else {
            log.error("Product not found to update with id: {}", product.getId());
        }
    }

    @Override
    public void deleteProduct(Product product) {
        Optional<Product> productOptional = productRepository.findById(product.getId());

        if (productOptional.isPresent()) {
            productRepository.delete(product);
            log.info("Product deleted successfully with id: {}", product.getId());
        } else {
            log.error("Product not found to delete with id: {}", product.getId());
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCreator(String category) {
        return List.of();
    }
}
