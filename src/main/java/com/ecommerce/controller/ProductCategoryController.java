package com.ecommerce.controller;

import com.ecommerce.entity.*;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/productcategories")
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping
    public ResponseEntity<List<ProductCategory>> findAll() {
        List<ProductCategory> list = productCategoryService.findAll();

        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
