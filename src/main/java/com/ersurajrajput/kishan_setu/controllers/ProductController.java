package com.ersurajrajput.kishan_setu.controllers;

import com.ersurajrajput.kishan_setu.models.ProductModel;
import com.ersurajrajput.kishan_setu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public Page<ProductModel> getProductsBySize(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
    }
    @GetMapping("/all")
    public List<ProductModel> all() {
        return productRepository.findAll();
    }



}
