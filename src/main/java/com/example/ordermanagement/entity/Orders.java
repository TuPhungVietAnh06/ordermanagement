package com.example.ordermanagement.entity;

import com.example.ordermanagement.constant.OrderStatus;
import com.example.ordermanagement.constant.PaymentMethod;
import com.example.ordermanagement.constant.OrderPaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name ="orders")
public class Orders extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "customer_id", length = 36, nullable = false)
    private String customerId;

    @Column(name = "carrier_id",  length = 36)
    private String carrierId;

    @Column(name = "address_id", length = 36)
    private String addressId;

    @Column(name = "shipping_full_name", nullable = false)
    private String shippingFullName;

    @Column(name = "shipping_phone_number", nullable = false)
    private String shippingPhoneNumber;

    @Column(name = "shipping_province", nullable = false)
    private String shippingProvince;

    @Column(name = "shipping_district", nullable = false)
    private String shippingDistrict;

    @Column(name = "shipping_ward", nullable = false)
    private String shippingWard;

    @Column(name = "shipping_street", nullable = false)
    private String shippingStreet;

    @Column(name = "tracking_number", length = 100, unique = true)
    private String trackingNumber;

    @Column(precision = 15, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "order_discount", precision = 15, scale = 2)
    private BigDecimal orderDiscount;

    @Column(name = "shipping_fee", precision = 15, scale = 2)
    private BigDecimal shippingFee;

    @Column(name = "grand_total", precision = 15, scale = 2)
    private BigDecimal grandTotal;

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(name = "payment_status")
    @Enumerated(EnumType.STRING)
    private OrderPaymentStatus paymentStatus = OrderPaymentStatus.UNPAID;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.PENDING;

    private String note;

    @Column(name = "estimated_delivery")
    private Instant estimatedDelivery;
}
