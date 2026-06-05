package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="cart_items")
public class CartItems extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "cart_id", length = 36, nullable = false, unique = true)
    private String cartId;

    @Column(name = "product_id", length = 36, nullable = false, unique = true)
    private String productId;

    private Integer quantity;
}
