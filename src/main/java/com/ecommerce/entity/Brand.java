package com.ecommerce.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="B2C_BRND")
public class Brand {
    @Id
    private Integer id;
    private String name;

    @JsonIgnoreProperties("brand")
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
