package com.example.demo.service;

import com.example.demo.model.Owner;

import java.util.Optional;

public interface OwnerService {

    Owner saveOwner(Owner owner);

    Owner editOwner(Owner owner);

    Optional<Owner> findById(Long id);

    void deleteOwnerById(Long id);
}
