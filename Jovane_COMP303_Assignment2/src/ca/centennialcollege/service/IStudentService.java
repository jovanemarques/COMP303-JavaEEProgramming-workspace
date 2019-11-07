package ca.centennialcollege.service;

import java.util.List;

import ca.centennialcollege.model.Student;

public interface IStudentService {
	List<Student> findAll();

	Student findOne(Integer id);

	Student save(Student student);
}
