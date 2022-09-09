package com.ecommerce.repository;

import com.ecommerce.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
