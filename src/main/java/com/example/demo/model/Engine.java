package com.example.demo.model;

import javax.persistence.*;


@Entity(name = "engine")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "engineNumber"))
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int horsePower;
    private int volume;

    @Column(name = "engineNumber")
    private String engineNumber;

    public Engine(Long id, int horsePower, int volume, String engineNumber) {
        this.id = id;
        this.horsePower = horsePower;
        this.volume = volume;
        this.engineNumber = engineNumber;
    }

    public Long getId(){ return id; }

    public void setId(Long id) { this.id = id; }

    public int getHorsePower() {
        return horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }
}
