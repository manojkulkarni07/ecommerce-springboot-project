package com.manoj.ecommerce.repository;
import java.util.List;

import com.manoj.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
    List<Product> findByNameContaining(String keyword);
}