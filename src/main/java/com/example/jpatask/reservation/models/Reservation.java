package com.example.jpatask.reservation.models;

import com.example.jpatask.customer.models.Customer;
import com.example.jpatask.planet.models.Planet;
import com.example.jpatask.spaceship.models.Spaceship;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Spaceship spaceShip;

    @ManyToOne
    private Planet destination;

    @Temporal(TemporalType.TIME)
    private Date timeFrame;

    @ManyToMany(targetEntity = Customer.class)
    private Set customerSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Spaceship getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(Spaceship spaceShip) {
        this.spaceShip = spaceShip;
    }

    public Planet getDestination() {
        return destination;
    }

    public void setDestination(Planet destination) {
        this.destination = destination;
    }

    public Date getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(Date timeFrame) {
        this.timeFrame = timeFrame;
    }

    public Set getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set customerSet) {
        this.customerSet = customerSet;
    }
}
