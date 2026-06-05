package com.example.ordermanagement.service;

import com.example.ordermanagement.dto.response.DiscountResponse;
import com.example.ordermanagement.entity.DiscountRules;

public interface DiscountRulesService {
    DiscountResponse getDiscount();
}
