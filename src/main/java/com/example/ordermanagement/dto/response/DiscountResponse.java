package com.example.ordermanagement.dto.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DiscountResponse {
    private String name;
    private BigDecimal percent;

    public static DiscountResponse none() {
        return DiscountResponse.builder()
                .name(null)
                .percent(BigDecimal.ZERO)
                .build();
    }
}
