package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.PaymentTransaction;
import com.example.ordermanagement.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, String> {
}
