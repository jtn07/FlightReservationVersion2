package com.jatin.flightReservationVersion2.repos;

import com.jatin.flightReservationVersion2.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
