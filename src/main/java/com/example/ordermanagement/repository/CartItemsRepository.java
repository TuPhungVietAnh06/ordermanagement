package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRepository extends JpaRepository<CartItems, String> {
}
