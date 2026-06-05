package com.example.ordermanagement.entity;

import com.example.ordermanagement.constant.NotificationStatus;
import com.example.ordermanagement.constant.NotificationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name ="notification_jobs")
public class NotificationJobs extends BaseEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(name = "order_id", length = 36, nullable = false)
    private String orderId;

    @Column(name = "user_id",  length = 36, nullable = false)
    private String userId;

    @Enumerated(EnumType.STRING)
    private NotificationType type = NotificationType.EMAIL;

    @Enumerated(EnumType.STRING)
    private NotificationStatus status =  NotificationStatus.PENDING;

    @Column(name = "retry_count")
    private Integer retryCount = 0;

    @Column(name = "sent_at")
    private Instant sentAt;
}
