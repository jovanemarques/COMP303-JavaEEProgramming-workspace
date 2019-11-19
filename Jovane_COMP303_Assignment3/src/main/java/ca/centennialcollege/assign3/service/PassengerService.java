package ca.centennialcollege.assign3.service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import ca.centennialcollege.assign3.model.Passenger;

@Service
public class PassengerService implements IPassengerService {

	private final Map<Integer, Passenger> passengers = new ConcurrentHashMap<>();

	@Override
	public Iterable<Passenger> findAll() {
		return passengers.values();
	}

	@Override
	public Passenger create(Passenger passenger) {
		passengers.put(passenger.getPassengerId(), passenger);
		return passenger;
	}

	@Override
	public Optional<Passenger> find(Integer id) {
		return Optional.ofNullable(passengers.get(id));
	}

}
