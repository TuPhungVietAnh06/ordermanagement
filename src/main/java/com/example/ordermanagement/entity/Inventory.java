package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="inventory")
public class Inventory extends  BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "product_id",  length = 36, nullable = false, unique = true)
    private String productId;

    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
}
