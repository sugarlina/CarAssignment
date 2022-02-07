package com.example.demo.controller;

import com.example.demo.dto.EngineDto;
import com.example.demo.exceptions.EngineNotFoundException;
import com.example.demo.model.Engine;
import com.example.demo.service.EngineService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/engines")
public class EngineController {

    @Autowired
    private EngineService engineService;

    private ModelMapper modelMapper = new ModelMapper();

    @PostMapping
    ResponseEntity<EngineDto> createEngine(@Valid @RequestBody EngineDto newEngine) {
        Engine engine = modelMapper.map(newEngine, Engine.class);
        Engine createdEngine = engineService.saveEngine(engine);
        EngineDto mappedDto = modelMapper.map(createdEngine, EngineDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @GetMapping("/{id}")
    ResponseEntity<EngineDto> findById(@PathVariable(value = "id") Long id) {
        Optional<Engine> optionalEngine = engineService.findById(id);
        if(optionalEngine.isEmpty()) {
            throw new EngineNotFoundException(id);
        }

        EngineDto mappedDto = modelMapper.map(optionalEngine.get(), EngineDto.class);
        return ResponseEntity.ok(mappedDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<EngineDto> deleteEngine(@PathVariable(value = "id") Long id) {
        Optional<Engine> optionalEngine = engineService.findById(id);
        if(optionalEngine.isEmpty()) {
            throw new EngineNotFoundException(id);
        }
        engineService.deleteEngineById(id);
        EngineDto mappedDto = modelMapper.map(optionalEngine.get(), EngineDto.class);
        return ResponseEntity.ok(mappedDto);
    }






}
