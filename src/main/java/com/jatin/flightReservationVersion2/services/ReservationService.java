package com.jatin.flightReservationVersion2.services;

import com.jatin.flightReservationVersion2.dto.ReservationRequest;
import com.jatin.flightReservationVersion2.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
