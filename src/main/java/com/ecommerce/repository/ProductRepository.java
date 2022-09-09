package com.ecommerce.repository;

import com.ecommerce.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.colorId = :colorId")
    List<Product> findByColorId(@Param(value = "colorId") Integer colorId);

    @Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.brandId = :brandId")
    List<Product> findByBrandId(@Param(value = "brandId") Integer brandId);

    List<Product> findBySize(String actualvalue);
}
