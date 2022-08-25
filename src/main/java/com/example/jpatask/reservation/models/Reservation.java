package com.example.jpatask.reservation.models;

import com.example.jpatask.customer.models.Customer;
import com.example.jpatask.planet.models.Planet;
import com.example.jpatask.spaceship.models.Spaceship;

import javax.persistence.*;
import java.util.Date;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
