package com.ecommerce.controller;

import com.ecommerce.entity.*;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/colors")
public class ColorController {
    @Autowired
    ColorService colorService;

    @GetMapping
    public ResponseEntity<List<Color>> findAll() {
        List<Color> list = colorService.findAll();
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
