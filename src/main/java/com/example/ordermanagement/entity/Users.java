package com.example.ordermanagement.entity;

import com.example.ordermanagement.constant.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="users")
public class Users extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(unique = true)
    private String email;

    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "avatar_url")
    private String avatarUrl;

    private Role role = Role.CUSTOMER;
}
