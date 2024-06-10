package com.tpe.service;

import com.tpe.dto.CarRequest;
import com.tpe.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public void createCar(CarRequest carRequest) {


        carRepository.save(modelMapper(carRequest));
    }
}
