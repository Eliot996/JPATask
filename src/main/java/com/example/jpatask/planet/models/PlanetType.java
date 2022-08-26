package com.example.jpatask.planet.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "planetTypes")
public class PlanetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @JsonManagedReference
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "planet_types_planets",
            joinColumns = @JoinColumn(name = "planet_type_id_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id"))
    private List<Planet> planets = new ArrayList<>();

    public PlanetType(String type) {
        this.type = type;
    }
}
