package com.example.jpatask.planet.repository;

import com.example.jpatask.planet.models.PlanetType;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<PlanetType, Long> {

}
