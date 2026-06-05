package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="categories")
public class Categories extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    private String name;

    @Column(unique = true)
    private String slug;

    @Column(name = "parent_id")
    private String parentId;
}
