package ca.centennialcollege.assign3.service;

import java.util.Optional;

import ca.centennialcollege.assign3.model.Flight;

public interface IFlightService {
	Iterable<Flight> findAll();

	Flight create(Flight flight);

	Optional<Flight> find(Integer id);
}
