package com.example.demo.service;

import com.example.demo.model.Engine;

import java.util.Optional;

public interface EngineService {

    Engine editEngine(Engine engine);

    Engine saveEngine (Engine engine);

    void deleteEngineById(Long id);

    Optional<Engine> findById(Long id);

}
