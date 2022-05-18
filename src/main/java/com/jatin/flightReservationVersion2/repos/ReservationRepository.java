package com.jatin.flightReservationVersion2.repos;

import com.jatin.flightReservationVersion2.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
