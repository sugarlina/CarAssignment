package com.example.demo.service;

import com.example.demo.model.Car;

import java.util.Optional;

public interface CarService {

    Car editCar(Car car);

    Car saveCar (Car car);

    Optional<Car> findById(Long id);

    void deleteCarById(Long id);

}
