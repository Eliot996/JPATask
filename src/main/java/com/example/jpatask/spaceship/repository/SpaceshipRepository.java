package com.example.jpatask.spaceship.repository;

import com.example.jpatask.spaceship.models.Spaceship;
import org.springframework.data.repository.CrudRepository;

public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
}
