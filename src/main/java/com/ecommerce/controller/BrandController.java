package com.ecommerce.controller;

import com.ecommerce.entity.*;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    @Autowired
    BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> findAll() {
        List<Brand> list = brandService.findAll();

        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
