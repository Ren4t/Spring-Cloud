package com.example.productservice.services;

import com.example.productservice.model.Product;
import com.example.productservice.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }


    public Product save(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
