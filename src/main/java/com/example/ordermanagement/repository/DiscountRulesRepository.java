package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.DiscountRules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiscountRulesRepository extends JpaRepository<DiscountRules, String>, JpaSpecificationExecutor<DiscountRules> {

}
