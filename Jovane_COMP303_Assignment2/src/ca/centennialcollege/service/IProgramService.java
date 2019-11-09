package ca.centennialcollege.service;

import java.util.List;

import ca.centennialcollege.model.Program;

public interface IProgramService {
	List<Program> findAll();
	Program findOne(String parameter);
}
