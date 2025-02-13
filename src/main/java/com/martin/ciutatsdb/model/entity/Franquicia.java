package com.martin.ciutatsdb.model.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "FRANQUICIES")
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descripcio;

    @ManyToMany
    @JoinTable(
            name = "FRANQUICIA_CIUTAT",
            joinColumns = @JoinColumn(name = "FRANQUICIA_ID"),
            inverseJoinColumns = @JoinColumn(name = "CIUTAT_ID")
    )
    private List<Ciutats> ciutats;

    public Franquicia() {
    }

    public Franquicia(int id, String descripcio, List<Ciutats> ciutats) {
        this.id = id;
        this.descripcio = descripcio;
        this.ciutats = ciutats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public List<Ciutats> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutats> ciutats) {
        this.ciutats = ciutats;
    }
}
