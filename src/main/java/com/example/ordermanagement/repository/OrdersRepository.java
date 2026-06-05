package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, String> {
}
