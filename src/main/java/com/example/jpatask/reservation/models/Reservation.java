package com.example.jpatask.reservation.models;

import com.example.jpatask.customer.models.Customer;
import com.example.jpatask.planet.models.Planet;
import com.example.jpatask.spaceship.models.Spaceship;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Spaceship spaceShip;

    @ManyToOne
    private Planet destination;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date endDate;

    @JsonBackReference
    @ManyToMany(mappedBy = "reservations")
    private List<Customer> customerSet;

}
