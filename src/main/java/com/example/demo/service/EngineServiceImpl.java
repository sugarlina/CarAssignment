package com.example.demo.service;

import com.example.demo.model.Engine;
import com.example.demo.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EngineServiceImpl implements EngineService{

    @Autowired
    private EngineRepository engineRepository;

    @Override
    public Engine editEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public Engine saveEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public void deleteEngineById(Long id) {
        engineRepository.deleteById(id);
    }

    @Override
    public Optional<Engine> findById(Long id) {
        return engineRepository.findById(id);
    }
}
