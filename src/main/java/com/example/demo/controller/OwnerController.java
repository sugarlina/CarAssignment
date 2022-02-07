package com.example.demo.controller;


import com.example.demo.dto.OwnerDto;
import com.example.demo.exceptions.OwnerNotFoundException;
import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.service.OwnerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {

   @Autowired
    private OwnerService ownerService;

   private ModelMapper modelMapper = new ModelMapper();

   @PostMapping
    ResponseEntity<OwnerDto> createOwner(@Valid @RequestBody OwnerDto newOwner) {
       Owner owner = modelMapper.map(newOwner, Owner.class);
       Owner createdOwner = ownerService.saveOwner(owner);
       OwnerDto mappedDto = modelMapper.map(createdOwner, OwnerDto.class);
       return ResponseEntity.ok(mappedDto);
   }

   @GetMapping("/{id}")
    ResponseEntity<OwnerDto> findById(@PathVariable(value = "id") Long id) {
       Optional<Owner> optionalOwner = ownerService.findById(id);
       if(optionalOwner.isEmpty()) {
           throw new OwnerNotFoundException(id);
       }

       OwnerDto mappedDto = modelMapper.map(optionalOwner, OwnerDto.class);
       return ResponseEntity.ok(mappedDto);
   }

   @DeleteMapping("/{id}")
    ResponseEntity<OwnerDto> deleteOwner(@PathVariable(value = "id") Long id){
       Optional<Owner> optionalOwner = ownerService.findById(id);
       if(optionalOwner.isEmpty()) {
           throw new OwnerNotFoundException(id);
       }

       ownerService.deleteOwnerById(id);
       OwnerDto mappedDto = modelMapper.map(optionalOwner, OwnerDto.class);
       return ResponseEntity.ok(mappedDto);
   }

}
