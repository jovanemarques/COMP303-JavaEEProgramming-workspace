package ca.centennialcollege.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ca.centennialcollege.model.Student;

public class StudentService implements IStudentService {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jovane_COMP303_Assignment2");

	private static EntityManager em = factory.createEntityManager();

	@Override
	public List<Student> findAll() {
		Query query = em.createQuery("select s from Student s");
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public Student findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student save(Student student) {
		em.getTransaction().begin();
		if (student.getStudentId() == null) {
			System.out.println("Inserting new student");
			em.persist(student);
		} else {
			em.merge(student);
			System.out.println("Updating existing student");
		}
		em.getTransaction().commit();
		System.out.println("Student saved with id: " + student.getStudentId());
		return student;
	}

	public Student findByUsernameAndPassword(String username, String password) {
		Student stu = null;
		List<Student> list = em
				.createQuery("select s from Student s where s.username = :username and s.password = :password ")
				.setParameter("username", username).setParameter("password", password).setMaxResults(1).getResultList();
		if (list.size() > 0) {
			stu = list.get(0);
		}
		return stu;
	}

}
