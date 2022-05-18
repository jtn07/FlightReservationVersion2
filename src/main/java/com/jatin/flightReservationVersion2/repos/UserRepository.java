package com.jatin.flightReservationVersion2.repos;

import com.jatin.flightReservationVersion2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
