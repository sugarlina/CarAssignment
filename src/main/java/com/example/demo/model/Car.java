package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please, provide a brand.")
    private String brand;

    @NotEmpty(message = "Please, provide a model.")
    private String model;

    @NotEmpty(message = "Please, provide the year of production.")
    private int yearOfProduction;

    @NotEmpty(message = "Please, provide a car number.")
    private String number;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Engine.class)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Owner.class)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Car() {

    }

    public Car(Engine engine,Owner owner,Long id, String brand, String model, int yearOfProduction, String number) {
        this.id = id;
        this.engine = engine;
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.number = number;
    }

    public Engine getEngine() { return engine; }

    public Owner getOwner() { return owner; }

    public void setEngine(Engine engine) {this.engine = engine;}

    public void setOwner(Owner owner) {this.owner = owner;}

    public Long getId(){ return id; }

    public void setId(Long id) { this.id = id; }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getNumber() {
        return number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", engine= " + engine +
                ", owner= " + owner +
                ", brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", year of production= " + yearOfProduction +
                ", number= '" + number + '\'' +
                "}";
    }
}
