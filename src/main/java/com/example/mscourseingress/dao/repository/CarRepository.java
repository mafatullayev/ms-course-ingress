package com.example.mscourseingress.dao.repository;

import com.example.mscourseingress.dao.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
    @Override
    Optional<CarEntity> findById(Long id);
}
