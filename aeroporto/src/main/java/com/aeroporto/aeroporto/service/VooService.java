package com.aeroporto.aeroporto.service;

import com.aeroporto.aeroporto.domain.Voo;
import com.aeroporto.aeroporto.repository.VooRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VooService {
    private final VooRepository vooRepository;

    public List<Voo> listAll() {
        return vooRepository.findAll();
    }
}
