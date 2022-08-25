package com.example.jpatask.reservation.repository;

import com.example.jpatask.reservation.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
