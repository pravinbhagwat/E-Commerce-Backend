package com.digitox.ecommercebackend.repositories;

import com.digitox.ecommercebackend.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
