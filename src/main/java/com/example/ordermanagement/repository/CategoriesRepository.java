package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, String> {
}
