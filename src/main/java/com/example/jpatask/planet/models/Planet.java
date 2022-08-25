package com.example.jpatask.planet.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private long mass;
    private int diameter;
    private int density;
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

    @ManyToOne
    private PlanetType type;

    @ManyToMany(targetEntity = PlanetType.class)
    private Set planetTypeSet;

    public Planet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public long getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getEscapeVelocity() {
        return escapeVelocity;
    }

    public void setEscapeVelocity(double escapeVelocity) {
        this.escapeVelocity = escapeVelocity;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double getLengthOfDay() {
        return lengthOfDay;
    }

    public void setLengthOfDay(double lengthOfDay) {
        this.lengthOfDay = lengthOfDay;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(double perihelion) {
        this.perihelion = perihelion;
    }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion(double aphelion) {
        this.aphelion = aphelion;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getOrbitalVelocity() {
        return orbitalVelocity;
    }

    public void setOrbitalVelocity(double orbitalVelocity) {
        this.orbitalVelocity = orbitalVelocity;
    }

    public double getOrbitalInclination() {
        return orbitalInclination;
    }

    public void setOrbitalInclination(double orbitalInclination) {
        this.orbitalInclination = orbitalInclination;
    }

    public double getOrbitalEccentricity() {
        return orbitalEccentricity;
    }

    public void setOrbitalEccentricity(double orbitalEccentricity) {
        this.orbitalEccentricity = orbitalEccentricity;
    }

    public double getObliquityToOrbit() {
        return obliquityToOrbit;
    }

    public void setObliquityToOrbit(double obliquityToOrbit) {
        this.obliquityToOrbit = obliquityToOrbit;
    }

    public double getMeanTemperature() {
        return meanTemperature;
    }

    public void setMeanTemperature(double meanTemperature) {
        this.meanTemperature = meanTemperature;
    }

    public double getSurfacePressure() {
        return surfacePressure;
    }

    public void setSurfacePressure(double surfacePressure) {
        this.surfacePressure = surfacePressure;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public boolean isRingSystem() {
        return isRingSystem;
    }

    public void setRingSystem(boolean ringSystem) {
        isRingSystem = ringSystem;
    }

    public boolean isHasGlobalMagneticField() {
        return hasGlobalMagneticField;
    }

    public void setHasGlobalMagneticField(boolean hasGlobalMagneticField) {
        this.hasGlobalMagneticField = hasGlobalMagneticField;
    }
}
