package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name ="discount_rules")
public class DiscountRules extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    private String name;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal percent;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
