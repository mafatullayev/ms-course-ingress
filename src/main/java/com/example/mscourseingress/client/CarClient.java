package com.example.mscourseingress.client;

import com.example.mscourseingress.model.reponse.CarResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-car")
public interface CarClient {

    @GetMapping("internal/v1/payments/{id}")
    CarResponse getCarResponse(@PathVariable Long id);
}
