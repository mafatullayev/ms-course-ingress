package com.example.mscourseingress.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRequest {
    private Long id;
    private String modelName;
    private BigDecimal cost;
}
