package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
    List<Product> findByPriceRange(double min, double max);
}