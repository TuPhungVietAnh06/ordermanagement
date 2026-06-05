package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartsRepository extends JpaRepository<Carts, String> {
}
