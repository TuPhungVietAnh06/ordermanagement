package com.example.ordermanagement.controller;

import com.example.ordermanagement.common.BaseResponse;
import com.example.ordermanagement.dto.response.DiscountResponse;
import com.example.ordermanagement.service.DiscountRulesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@RestController
@RequestMapping("/v1/discounts")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DiscountRulesController {
    private final DiscountRulesService discountRulesService;

    @GetMapping()
    public ResponseEntity<BaseResponse<DiscountResponse>> getDiscount() {
        return ResponseEntity.ok(new BaseResponse<>(discountRulesService.getDiscount(), "Success"));
    }
}
