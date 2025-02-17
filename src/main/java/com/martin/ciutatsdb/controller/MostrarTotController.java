package com.martin.ciutatsdb.controller;

import com.martin.ciutatsdb.model.repository.CiutatRepository;
import com.martin.ciutatsdb.model.repository.PaisRepository;
import com.martin.ciutatsdb.model.repository.ProvinciaRepository;
import com.martin.ciutatsdb.model.repository.FranquiciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MostrarTotController {

    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private ProvinciaRepository provinciesRepository;
    @Autowired
    private CiutatRepository ciutatsRepository;
    @Autowired
    private FranquiciaRepository franquiciesRepository;

    @GetMapping("/paisos")
    public String getAllPaisos(Model model) {
        model.addAttribute("paisos", paisRepository.findAll());
        return "paisosList";
    }
    @GetMapping("/provincies")
    public String getAllProvincies(Model model) {
        model.addAttribute("provincies", provinciesRepository.findAll());
        return "provinciesList";
    }

    @GetMapping("/ciutats")
    public String getAllCiutats(Model model) {
        model.addAttribute("ciutats", ciutatsRepository.findAll());
        return "ciutatsList";
    }

    @GetMapping("/franquicies")
    public String getAllFranquicies(Model model) {
        model.addAttribute("franquicies", franquiciesRepository.findAll());
        return "franquiciesList";
    }
}
