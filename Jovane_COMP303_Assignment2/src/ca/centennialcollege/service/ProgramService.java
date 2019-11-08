package ca.centennialcollege.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ca.centennialcollege.model.Program;

public class ProgramService implements IProgramService {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jovane_COMP303_Assignment2");

	private static EntityManager em = factory.createEntityManager();

	@Override
	public List<Program> findAll() {
		List list = em.createQuery("select p from Program p").getResultList();
		return list;
	}

}
