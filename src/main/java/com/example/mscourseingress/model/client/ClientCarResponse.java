package com.example.mscourseingress.model.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientCarResponse {
    private Long id;
    private String modelName;
    private BigDecimal cost;
}
