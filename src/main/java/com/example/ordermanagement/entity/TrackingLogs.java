package com.example.ordermanagement.entity;

import com.example.ordermanagement.constant.TrackingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="tracking_logs")
public class TrackingLogs extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "order_id", length = 36, nullable = false)
    private String orderId;

    @Column(name = "from_status")
    private TrackingStatus fromStatus;

    @Column(name = "to_status")
    private TrackingStatus toStatus;

    @Column(length = 500)
    private String note;

    private String location;
}
