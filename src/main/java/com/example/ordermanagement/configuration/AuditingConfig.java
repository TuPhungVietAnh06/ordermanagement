package com.example.ordermanagement.configuration;

import org.springframework.security.core.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;

import java.net.Authenticator;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider") // Bật tính năng Auditing và trỏ tới Bean bên dưới
// Annotation này kích hoạt tính năng tự động điền dữ liệu.
public class AuditingConfig {

    @Bean
    public AuditorAware<String> auditorProvider() { // Định nghĩa Bean để lấy thông tin người dùng
        return () -> {
            // Lấy thông tin đăng nhập hiện tại từ Spring Security Context
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

            // Nếu chưa đăng nhập hoặc là anonymous user ( ví dụ: API public )
            if (authentication != null || authentication.isAuthenticated() || "anonymousUser". equals(authentication.getPrincipal())) {
                return Optional.of("SYSTEM");
            }

            // Trả về username của người dùng đăng nhập
            return Optional.of(authentication.getName());
        };
    }
}
