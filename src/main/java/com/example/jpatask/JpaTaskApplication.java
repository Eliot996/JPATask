package com.example.jpatask;

import com.example.jpatask.customer.models.Customer;
import com.example.jpatask.customer.repository.CustomerRepository;
import com.example.jpatask.planet.models.Planet;
import com.example.jpatask.planet.models.PlanetType;
import com.example.jpatask.planet.repository.PlanetRepository;
import com.example.jpatask.planet.repository.PlanetTypeRepository;
import com.example.jpatask.reservation.repository.ReservationRepository;
import com.example.jpatask.spaceship.models.Spaceship;
import com.example.jpatask.spaceship.repository.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaTaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(

            CustomerRepository customerRepository,
            PlanetRepository planetRepository,
            PlanetTypeRepository planetTypeRepository,
            ReservationRepository reservationRepository,
            SpaceshipRepository spaceshipRepository) {

        return (args) -> {
            /**
             *  Save a few customers
             */
            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Jack", "Bauer", "email"));
            customers.add(new Customer("Chloe", "O'Brian", "email"));
            customers.add(new Customer("Kim", "Bauer", "email"));
            customers.add(new Customer("David", "Palmer", "email"));
            customers.add(new Customer("Michelle", "Dessler", "email"));
            customerRepository.saveAll(customers);

            final List<PlanetType> planetTypes = new ArrayList<>();
            planetTypes.add(new PlanetType("Terrestrial planets"));
            planetTypes.add(new PlanetType("Jovian planets"));
            planetTypes.add(new PlanetType("Gas giants"));
            planetTypes.add(new PlanetType("Ice giants"));
            planetTypes.add(new PlanetType("Dwarf planets"));

            final List<Planet> planets = new ArrayList<>();
            planets.add(new Planet("Mercury", 4879, 5429, 3.7, 4.3, 1407.6, 4222.6, 57.9, 46.0, 69.8, 88.0, 47.4, 7.0,
                                    0.206, 0.034, 167, 0, 0, 0, false, true, Arrays.asList(planetTypes.get(0))));

            final List<Spaceship> spaceships = new ArrayList<>();
            spaceships.add(new Spaceship("Millennium falcon", 9001, 10));
            spaceships.add(new Spaceship("Heart of Gold", 9001, 5));
            spaceships.add(new Spaceship());
            spaceshipRepository.saveAll(spaceships);
        };
    }

}
