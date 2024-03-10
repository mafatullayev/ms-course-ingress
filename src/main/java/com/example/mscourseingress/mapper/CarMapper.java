package com.example.mscourseingress.mapper;

import com.example.mscourseingress.dao.entity.CarEntity;
import com.example.mscourseingress.model.reponse.CarResponse;
import com.example.mscourseingress.model.request.CarRequest;

import java.util.List;
import java.util.stream.Collectors;

public enum CarMapper {
    CAR_MAPPER;

    public CarEntity buildCarEntity(CarRequest carRequest) {
        return CarEntity.builder()
                .modelName(carRequest.getModelName())
                .cost(carRequest.getCost())
                .build();
    }

    public CarResponse buildCarResponse(CarEntity carEntity) {
        return CarResponse.builder()
                .id(carEntity.getId())
                .modelName(carEntity.getModelName())
                .cost(carEntity.getCost())
                .build();
    }

    public List<CarResponse> buildCarResponseList(List<CarEntity> carEntities) {
        return carEntities.stream()
                .map(this::buildCarResponse)
                .collect(Collectors.toList());
    }
}