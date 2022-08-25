package com.example.jpatask;

import com.example.jpatask.customer.models.Customer;
import com.example.jpatask.customer.repository.CustomerRepository;
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

            final List<Spaceship> spaceships = new ArrayList<>();
            spaceships.add(new Spaceship("Millennium falcon", 9001, 10));
            spaceships.add(new Spaceship("Heart of Gold", 9001, 5));
            spaceships.add(new Spaceship());
            spaceshipRepository.saveAll(spaceships);
        };
    }

}
