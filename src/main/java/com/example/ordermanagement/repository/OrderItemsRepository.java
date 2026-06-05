package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems, String> {
}
