package com.example.demo.controller;

import com.example.demo.dto.CarDto;
import com.example.demo.exceptions.CarNotFoundException;
import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    private ModelMapper modelMapper = new ModelMapper();


    @PostMapping
    ResponseEntity<CarDto> createCar(@Valid @RequestBody CarDto newCar) {
        Car car = modelMapper.map(newCar, Car.class);
        Car createdCar = carService.saveCar(car);
        CarDto mappedDto = modelMapper.map(createdCar, CarDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @GetMapping("/{id}")
    ResponseEntity<CarDto> findById(@PathVariable(value = "id") Long id){
        Optional<Car> optionalCar = carService.findById(id);
        if(optionalCar.isEmpty()) {
            throw new CarNotFoundException(id);
        }

        CarDto mappedDto = modelMapper.map(optionalCar.get(), CarDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<CarDto> deleteCar(@PathVariable(value = "id") Long id) {
        Optional<Car> optionalCar = carService.findById(id);
        if(optionalCar.isEmpty()) {
            throw new CarNotFoundException(id);
        }
        carService.deleteCarById(id);
        CarDto mappedDto = modelMapper.map(optionalCar.get(), CarDto.class);
        return ResponseEntity.ok(mappedDto);
    }
}
