package com.example.jpatask.planet.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    private double mass;
    private int diameter;
    private double density;
    private double gravity;
    private double escapeVelocity;
    private double rotationPeriod;
    private double lengthOfDay;
    private double distanceFromSun;
    private double perihelion;
    private double aphelion;
    private double orbitalPeriod;
    private double orbitalVelocity;
    private double orbitalInclination;
    private double orbitalEccentricity;
    private double obliquityToOrbit;
    private double meanTemperature;
    private double surfacePressure;
    private int numberOfMoons;
    private boolean isRingSystem;
    private boolean hasGlobalMagneticField;

    @JsonBackReference
    @ManyToMany(mappedBy = "planets")
    private List<PlanetType> planetTypes = new ArrayList<>();

    public Planet(String name, long mass, int diameter, double density, double gravity,
                  double escapeVelocity, double rotationPeriod, double lengthOfDay,
                  double distanceFromSun, double perihelion, double aphelion, double orbitalPeriod,
                  double orbitalVelocity, double orbitalInclination, double orbitalEccentricity,
                  double obliquityToOrbit, double meanTemperature, double surfacePressure,
                  int numberOfMoons, boolean isRingSystem, boolean hasGlobalMagneticField,
                  List<PlanetType> planetTypes) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.escapeVelocity = escapeVelocity;
        this.rotationPeriod = rotationPeriod;
        this.lengthOfDay = lengthOfDay;
        this.distanceFromSun = distanceFromSun;
        this.perihelion = perihelion;
        this.aphelion = aphelion;
        this.orbitalPeriod = orbitalPeriod;
        this.orbitalVelocity = orbitalVelocity;
        this.orbitalInclination = orbitalInclination;
        this.orbitalEccentricity = orbitalEccentricity;
        this.obliquityToOrbit = obliquityToOrbit;
        this.meanTemperature = meanTemperature;
        this.surfacePressure = surfacePressure;
        this.numberOfMoons = numberOfMoons;
        this.isRingSystem = isRingSystem;
        this.hasGlobalMagneticField = hasGlobalMagneticField;
        this.planetTypes = planetTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return getMass() == planet.getMass() && getDiameter() == planet.getDiameter() && getDensity() == planet.getDensity() && Double.compare(planet.getGravity(), getGravity()) == 0 && Double.compare(planet.getEscapeVelocity(), getEscapeVelocity()) == 0 && Double.compare(planet.getRotationPeriod(), getRotationPeriod()) == 0 && Double.compare(planet.getLengthOfDay(), getLengthOfDay()) == 0 && Double.compare(planet.getDistanceFromSun(), getDistanceFromSun()) == 0 && Double.compare(planet.getPerihelion(), getPerihelion()) == 0 && Double.compare(planet.getAphelion(), getAphelion()) == 0 && Double.compare(planet.getOrbitalPeriod(), getOrbitalPeriod()) == 0 && Double.compare(planet.getOrbitalVelocity(), getOrbitalVelocity()) == 0 && Double.compare(planet.getOrbitalInclination(), getOrbitalInclination()) == 0 && Double.compare(planet.getOrbitalEccentricity(), getOrbitalEccentricity()) == 0 && Double.compare(planet.getObliquityToOrbit(), getObliquityToOrbit()) == 0 && Double.compare(planet.getMeanTemperature(), getMeanTemperature()) == 0 && Double.compare(planet.getSurfacePressure(), getSurfacePressure()) == 0 && getNumberOfMoons() == planet.getNumberOfMoons() && isRingSystem() == planet.isRingSystem() && isHasGlobalMagneticField() == planet.isHasGlobalMagneticField() && getId().equals(planet.getId()) && getName().equals(planet.getName()) && Objects.equals(getPlanetTypes(), planet.getPlanetTypes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMass(), getDiameter(), getDensity(), getGravity(), getEscapeVelocity(), getRotationPeriod(), getLengthOfDay(), getDistanceFromSun(), getPerihelion(), getAphelion(), getOrbitalPeriod(), getOrbitalVelocity(), getOrbitalInclination(), getOrbitalEccentricity(), getObliquityToOrbit(), getMeanTemperature(), getSurfacePressure(), getNumberOfMoons(), isRingSystem(), isHasGlobalMagneticField(), getPlanetTypes());
    }
}
