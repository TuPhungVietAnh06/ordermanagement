package com.example.ordermanagement.entity;

import com.example.ordermanagement.constant.PaymentProvider;
import com.example.ordermanagement.constant.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name ="payment_transaction")
public class PaymentTransaction extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "order_id", length = 36, nullable = false)
    private String orderId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentProvider provider;

    @Column(name = "provider_txn_id", nullable = false)
    private String providerTxnId;

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status = PaymentStatus.PENDING;

    @Column(name = "raw_response", columnDefinition = "json")
    private String rawResponse;
}
