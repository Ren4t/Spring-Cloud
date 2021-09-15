package com.example.productservice.controllers;

import com.example.productservice.model.Product;
import com.example.productservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }
}
