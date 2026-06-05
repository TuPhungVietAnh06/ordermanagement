package com.example.ordermanagement.service.impl;

import com.example.ordermanagement.dto.response.DiscountResponse;
import com.example.ordermanagement.entity.DiscountRules;
import com.example.ordermanagement.repository.DiscountRulesRepository;
import com.example.ordermanagement.service.DiscountRulesService;
import com.example.ordermanagement.specification.DiscountRulesSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DiscountRulesServiceImpl implements DiscountRulesService {
    private final DiscountRulesRepository discountRulesRepository;

    @Override
    public DiscountResponse getDiscount() {
        Specification<DiscountRules> spec = Specification
                .where(DiscountRulesSpecification.notDeleted())
                .and(DiscountRulesSpecification.isActive());

        List<DiscountRules> rules = discountRulesRepository.findAll(spec);

        if (rules.isEmpty()) {
            return DiscountResponse.none();
        }

        DiscountRules rule = rules.get(0);

        return DiscountResponse.builder()
                .name(rule.getName())
                .percent(rule.getPercent())
                .build();
    }
}
