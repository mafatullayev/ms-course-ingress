package com.example.mscourseingress.model.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarResponse {
    private Long id;
    private String modelName;
    private BigDecimal cost;
}
