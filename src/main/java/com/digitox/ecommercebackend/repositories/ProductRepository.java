package com.digitox.ecommercebackend.repositories;

import com.digitox.ecommercebackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
