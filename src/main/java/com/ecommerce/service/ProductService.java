package com.ecommerce.service;

import com.ecommerce.entity.*;

import java.util.*;

public interface ProductService {
    List<Product> findAll();
    List<Product> getProducts(String groupbyvalue, String actualvalue);
}
