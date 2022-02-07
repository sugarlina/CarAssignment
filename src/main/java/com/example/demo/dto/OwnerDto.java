package com.example.demo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class OwnerDto {

    @Size(min = 6, message = "Not a valid name.")
    @NotEmpty(message = "Please, provide name.")
    private String ownerName;

    @NotEmpty(message = "Please, provide date of birth.")
    private String dateOfBirth;

    public OwnerDto() {

    }

    public OwnerDto(String ownerName, String dateOfBirth) {
        this.ownerName = ownerName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
