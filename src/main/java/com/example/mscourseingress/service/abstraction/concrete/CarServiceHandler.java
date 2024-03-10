package com.example.mscourseingress.service.abstraction.concrete;

import com.example.mscourseingress.client.CarClient;
import com.example.mscourseingress.dao.entity.CarEntity;
import com.example.mscourseingress.dao.repository.CarRepository;
import com.example.mscourseingress.exception.NotFoundException;
import com.example.mscourseingress.model.reponse.CarResponse;
import com.example.mscourseingress.model.request.CarRequest;
import com.example.mscourseingress.service.abstraction.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.example.mscourseingress.mapper.CarMapper.CAR_MAPPER;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarServiceHandler implements CarService {

    private final CarRepository carRepository;
    private final CarClient carClient;

    @Override
    public void buyCar(CarRequest request) {
        if (carClient.getCarResponse(request.getId()) == null) {
            throw new NotFoundException("Car not found");
        }
        log.info("ActionLog started: {}", request);
        carRepository.save(CAR_MAPPER.buildCarEntity(request));
        log.info("ActionLog ended: {}", request);
    }

    @Override
    public CarRequest getCar(Long id) {
        return null;
    }

    public CarResponse getOrder(Long id) {
        log.info("ActionLog.carResponse.started request: {}", id);
        var order = fetchOrderIfExist(id);
        return CAR_MAPPER.buildCarResponse((CarEntity) carClient);
    }

    private CarEntity fetchOrderIfExist(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Car not found"));
    }
}
