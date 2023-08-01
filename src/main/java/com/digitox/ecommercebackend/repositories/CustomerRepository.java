package com.digitox.ecommercebackend.repositories;

import com.digitox.ecommercebackend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
