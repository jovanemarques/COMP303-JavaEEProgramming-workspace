package ca.centennialcollege.service;

import java.util.List;

import ca.centennialcollege.model.Enrollment;
import ca.centennialcollege.model.Student;

public interface IEnrollmentService {
	List<Enrollment> findAll();

	Enrollment findOne(Integer id);

	Enrollment save(Enrollment enrollment);
}
