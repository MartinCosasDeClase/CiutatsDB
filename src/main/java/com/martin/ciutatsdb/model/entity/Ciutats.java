package com.martin.ciutatsdb.model.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Set;

@Entity
@Table(name= "CIUTATS")
public class Ciutats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private int poblacio;

    @ManyToOne
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincies provincia;

    @ManyToMany
    @JoinTable(
            name = "FRANQUICIA_CIUTAT",
            joinColumns = @JoinColumn(name = "ciutat_id"),
            inverseJoinColumns = @JoinColumn(name = "franquicia_id")
    )
    private List<Franquicia> franquicies;

    public Ciutats() {
    }

    public Ciutats(int id, String nom, int poblacio, Provincies provincia) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.provincia = provincia;
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

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public Provincies getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincies provincia) {
        this.provincia = provincia;
    }

    public List<Franquicia> getFranquicies() {
        return franquicies;
    }

    public void setFranquicies(List<Franquicia> franquicies) {
        this.franquicies = franquicies;
    }
}
