package ca.centennialcollege.assign3.service;

import java.util.Optional;

import ca.centennialcollege.assign3.model.Passenger;

public interface IPassengerService {
	Iterable<Passenger> findAll();

	Passenger create(Passenger passenger);

	Optional<Passenger> find(Integer id);
}
