package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.TrackingLogs;
import com.example.ordermanagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingLogsRepository extends JpaRepository<TrackingLogs, String> {
}
