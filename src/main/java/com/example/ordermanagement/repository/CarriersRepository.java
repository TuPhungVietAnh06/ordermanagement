package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Carriers;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CarriersRepository extends JpaRepository<Carriers, String> {
}
