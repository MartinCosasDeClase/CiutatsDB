package com.martin.ciutatsdb.controller;

import com.martin.ciutatsdb.model.entity.Franquicia;
import com.martin.ciutatsdb.model.entity.Paisos;
import com.martin.ciutatsdb.model.entity.Provincies;
import com.martin.ciutatsdb.model.entity.Ciutats;
import com.martin.ciutatsdb.model.repository.CiutatRepository;
import com.martin.ciutatsdb.model.repository.PaisRepository;
import com.martin.ciutatsdb.model.repository.ProvinciaRepository;
import com.martin.ciutatsdb.model.repository.FranquiciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
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
    public List<Paisos> getAllPaisos() {
        return paisRepository.findAll();
    }

    @PostMapping("/paisos")
    public Paisos addPais(@RequestBody Paisos pais) {
        return paisRepository.saveAndFlush(pais);
    }

    @PutMapping("/paisos/{id}")
    public Paisos updatePais(@PathVariable int id, @RequestBody Paisos pais) {
        pais.setId(id);
        return paisRepository.save(pais);
    }

    @DeleteMapping("/paisos/{id}")
    public void deletePais(@PathVariable int id) {
        paisRepository.deleteById(id);
    }

    @GetMapping("/provincies")
    public List<Provincies> getAllProvincies() {
        return provinciesRepository.findAll();
    }

    @PostMapping("/provincies")
    public Provincies addProvincies(@RequestBody Provincies provincies) {
        return provinciesRepository.save(provincies);
    }

    @PutMapping("/provincies/{id}")
    public Provincies updateProvincies(@PathVariable int id, @RequestBody Provincies provincies) {
        provincies.setId(id);
        return provinciesRepository.save(provincies);
    }

    @DeleteMapping("/provincies/{id}")
    public void deleteProvincies(@PathVariable int id) {
        provinciesRepository.deleteById(id);
    }

    @GetMapping("/ciutats")
    public List<Ciutats> getAllCiutats() {
        return ciutatsRepository.findAll();
    }

    @PostMapping("/ciutats")
    public Ciutats addCiutat(@RequestBody Ciutats ciutat) {
        return ciutatsRepository.save(ciutat);
    }

    @PutMapping("/ciutats/{id}")
    public Ciutats updateCiutat(@PathVariable int id, @RequestBody Ciutats ciutat) {
        ciutat.setId(id);
        return ciutatsRepository.save(ciutat);
    }

    @DeleteMapping("/ciutats/{id}")
    public void deleteCiutat(@PathVariable int id) {
        ciutatsRepository.deleteById(id);
    }

    @GetMapping("/franquicies")
    public List<Franquicia> getAllFranquicies() {
        return franquiciesRepository.findAll();
    }

    @PostMapping("/franquicies")
    public Franquicia addFranquicia(@RequestBody Franquicia franquicia) {
        return franquiciesRepository.save(franquicia);
    }

    @PutMapping("/franquicies/{id}")
    public Franquicia updateFranquicia(@PathVariable int id, @RequestBody Franquicia franquicia) {
        franquicia.setId(id);
        return franquiciesRepository.save(franquicia);
    }

    @DeleteMapping("/franquicies/{id}")
    public void deleteFranquicia(@PathVariable int id) {
        franquiciesRepository.deleteById(id);
    }

}
