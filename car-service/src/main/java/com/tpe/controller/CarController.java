package com.tpe.controller;

import com.tpe.domain.Car;
import com.tpe.dto.CarRequest;
import com.tpe.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    //http://localhost:8085/car + POST + JSON
    @PostMapping
    public ResponseEntity<String> saveCar(@RequestBody CarRequest carRequest){
        carService.createCar(carRequest);
        return new ResponseEntity<>("Car is saved successfully!", HttpStatus.CREATED);
    }





}
