package ca.centennialcollege.assign3.service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import ca.centennialcollege.assign3.model.Flight;

@Service
public class FlightService implements IFlightService {
	private final Map<Integer, Flight> flights = new ConcurrentHashMap<>();

	@Override
	public Iterable<Flight> findAll() {
		return flights.values();
	}

	@Override
	public Flight create(Flight flight) {
		flights.put(flight.getFlightId(), flight);
		return flight;
	}

	@Override
	public Optional<Flight> find(Integer id) {
		return Optional.ofNullable(flights.get(id));
	}

}
