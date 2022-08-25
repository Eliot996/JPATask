package com.example.jpatask.spaceship.models;

import javax.persistence.*;

@Entity
@Table(name = "spaceships")
public class Spaceship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private long maxSpeed;
    private int capacity;

    public Spaceship() {
    }

    public Spaceship(String name, long maxSpeed, int capacity) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
