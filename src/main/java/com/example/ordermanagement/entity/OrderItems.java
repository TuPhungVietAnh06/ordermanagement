package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name ="order_items")
public class OrderItems extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "order_id", length = 36, nullable = false)
    private String orderId;

    @Column(name = "product_id", length  = 36, nullable = false)
    private String productId;

    private Integer quantity;

    @Column(precision = 15, scale = 2)
    private BigDecimal subtotal;
}
