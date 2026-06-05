package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Addresses, String> {
}
