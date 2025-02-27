package com.martin.ciutatsdb.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "PAISOS")
public class Paisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;


    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("pais")
    private List<Provincies> provincies;

    public Paisos() {
    }

    public Paisos(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Provincies> getProvincies() {
        return provincies;
    }

    public void setProvincies(List<Provincies> provincies) {
        this.provincies = provincies;
    }
}
