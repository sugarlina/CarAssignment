package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car editCar(Car car) { return carRepository.save(car); }

    @Override
    public Car saveCar(Car car) { return carRepository.save(car); }

    @Override
    public Optional<Car> findById(Long id) { return carRepository.findById(id); }

    @Override
    public void deleteCarById(Long id) { carRepository.deleteById(id); }
}
