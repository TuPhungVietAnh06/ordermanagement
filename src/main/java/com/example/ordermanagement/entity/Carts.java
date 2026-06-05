package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="carts")
public class Carts extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "user_id", length = 36, nullable = false, unique = true)
    private String userId;
}
