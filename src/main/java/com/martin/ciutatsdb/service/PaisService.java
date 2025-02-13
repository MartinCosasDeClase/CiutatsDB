package com.martin.ciutatsdb.service;

import com.martin.ciutatsdb.model.repository.PaisRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @PostConstruct
    public void inicialitzar() {
        System.out.println("Servei inicialitzat: " + paisRepository.count() + " països a la base de dades.");
    }
}