package com.example.demo.dto;

import javax.validation.constraints.NotEmpty;

public class EngineDto {

    @NotEmpty(message = "Please, provide horse power.")
    private int horsePower;

    @NotEmpty(message = "Please, provide volume.")
    private int volume;

    @NotEmpty(message = "Please, provide engine number.")
    private String engineNumber;

    public EngineDto() {

    }

    public EngineDto(int horsePower, int volume, String engineNumber) {
        this.horsePower = horsePower;
        this.volume = volume;
        this.engineNumber = engineNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }
}
