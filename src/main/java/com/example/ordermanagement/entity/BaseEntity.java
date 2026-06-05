package com.example.ordermanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // BẮT BUỘC: Để kích hoạt bộ lắng nghe sự kiện
public class BaseEntity implements Serializable {

    @CreatedDate
    @Column(name = "created_at", updatable = false) // Sẽ tự động điền thời gian hiện tại khi INSERT
    private Instant createdAt;

    @CreatedBy
    @Column(name = "created_by",  updatable = false) // Sẽ tự động điền kết quả từ AuditorAware khi INSERT
    private String createdBy;

    @LastModifiedDate
    @Column(name = "updated_at") // Sẽ tự động điền/cập nhật khi UPDATE
    private Instant updatedAt;

    @LastModifiedBy
    @Column(name = "updated_by") // Sẽ tự động điền/cập nhật khi UPDATE
    private String updatedBy;

    private Boolean deleted;
}
