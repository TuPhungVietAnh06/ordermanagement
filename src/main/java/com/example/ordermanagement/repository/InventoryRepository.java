package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
