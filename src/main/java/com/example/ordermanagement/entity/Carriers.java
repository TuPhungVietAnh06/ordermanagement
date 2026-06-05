package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "carriers")
public class Carriers extends BaseEntity{
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(length = 36, nullable = false)
    private String name;

    @Column(length = 50, nullable = false,  unique = true)
    private String code;

    @Column(name = "is_active")
    private Boolean isActive;

}
