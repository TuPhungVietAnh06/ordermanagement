package com.example.ordermanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "addresses")
public class Addresses extends BaseEntity{
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "user_id", length = 36, nullable = false)
    private String userId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(length = 100, nullable = false)
    private String province;

    @Column(length = 100, nullable = false)
    private String district;

    @Column(length = 100, nullable = false)
    private String ward;

    @Column(length = 100, nullable = false)
    private String street;
}
