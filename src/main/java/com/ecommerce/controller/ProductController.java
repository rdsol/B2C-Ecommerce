package com.ecommerce.controller;

import com.ecommerce.entity.*;
import com.ecommerce.exception.*;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        if(products == null || products.isEmpty())
            throw new B2CException("Product not found!");

        return new ResponseEntity<>(products, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/filter/{filter}/{value}")
    public ResponseEntity<List<Product>> getProducts(@PathVariable String filter,
                                                     @PathVariable String value) {
        List<Product> products = productService.getProducts(filter, value);
        if(products==null || products.isEmpty())
            throw new B2CException("Product not found!");

        return new ResponseEntity<>(products,
                new HttpHeaders(), HttpStatus.OK);
    }
}
