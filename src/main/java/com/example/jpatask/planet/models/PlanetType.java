package com.example.jpatask.planet.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planetTypes")
public class PlanetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @ManyToMany(targetEntity = Planet.class)
    private Set planetSet;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
