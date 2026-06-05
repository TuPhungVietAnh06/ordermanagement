package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}
