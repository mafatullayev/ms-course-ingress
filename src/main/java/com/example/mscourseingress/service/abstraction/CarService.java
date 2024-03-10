package com.example.mscourseingress.service.abstraction;

import com.example.mscourseingress.model.request.CarRequest;
import org.springframework.stereotype.Service;

@Service
public interface CarService {
    void buyCar(CarRequest request);

    CarRequest getCar(Long id);
}
