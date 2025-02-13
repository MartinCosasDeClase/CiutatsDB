package com.martin.ciutatsdb.model.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROVINCIES")
public class Provincies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "PAIS_ID", nullable = false)
    private Paisos pais;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<Ciutats> ciutats;

    public Provincies() {
    }

    public Provincies(int id, String nom, Paisos pais) {
        this.id = id;
        this.nom = nom;
        this.pais = pais;
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

    public Paisos getPais() {
        return pais;
    }

    public void setPais(Paisos pais) {
        this.pais = pais;
    }

    public List<Ciutats> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutats> ciutats) {
        this.ciutats = ciutats;
    }
}
