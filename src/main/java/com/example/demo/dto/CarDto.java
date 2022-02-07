package com.example.demo.dto;

import javax.validation.constraints.NotEmpty;

public class CarDto {

    @NotEmpty(message = "Please, provide a car number.")
    private String number;

    @NotEmpty(message = "Please, provide a brand.")
    private String brand;

    @NotEmpty(message = "Please, provide a model.")
    private String model;

    @NotEmpty(message = "Please, provide year of production.")
    private int yearOfProduction;

    private EngineDto engineDto;

    private OwnerDto ownerDto;

    public CarDto() {

    }

    public CarDto(EngineDto engineDto, OwnerDto ownerDto, String number, String brand, String model, int yearOfProduction) {
        this.engineDto = engineDto;
        this.ownerDto = ownerDto;
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public EngineDto getEngineDto() {
        return engineDto;
    }

    public void setEngineDto(EngineDto engineDto) {
        this.engineDto = engineDto;
    }

    public OwnerDto getOwnerDto() {
        return ownerDto;
    }

    public void setOwnerDto(OwnerDto ownerDto) {
        this.ownerDto = ownerDto;
    }
}
