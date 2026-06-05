package com.example.ordermanagement.specification;

import com.example.ordermanagement.entity.DiscountRules;
import org.springframework.data.jpa.domain.Specification;

public class DiscountRulesSpecification {
    public static Specification<DiscountRules> isActive() {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("isActive"), true);
        };
    }

    public static Specification<DiscountRules> notDeleted() {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("deleted"), 0);
        };
    }
}
