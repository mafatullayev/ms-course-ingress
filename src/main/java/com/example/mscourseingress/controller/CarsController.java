package com.example.mscourseingress.controller;

import com.example.mscourseingress.model.request.CarRequest;
import com.example.mscourseingress.service.abstraction.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("v1/cars")
public class CarsController {

    private CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDeal(@RequestBody CarRequest request) {
        carService.buyCar(request);
    }

    @GetMapping("/{id}")
    public CarRequest getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }
}