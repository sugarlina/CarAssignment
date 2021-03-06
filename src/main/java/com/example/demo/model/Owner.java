package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please, provide name.")
    private String ownerName;

    @NotEmpty(message = "Please, provide date of birth.")
    private String dateOfBirth;

    public Owner() {

    }

    public Owner(Long id, String ownerName, String dateOfBirth) {
        this.id = id;
        this.ownerName = ownerName;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId(){ return id; }

    public void setId(Long id) { this.id = id; }

    public String getOwnerName() { return ownerName; }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id = " + id +
                ", ownerName= '" + ownerName + '\'' +
                ", dateOfBirth= '" + dateOfBirth + '\'' +
                "}";
    }
}
