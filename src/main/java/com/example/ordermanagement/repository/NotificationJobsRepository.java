package com.example.ordermanagement.repository;

import com.example.ordermanagement.entity.NotificationJobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationJobsRepository extends JpaRepository<NotificationJobs, String> {
}
