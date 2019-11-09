package ca.centennialcollege.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ca.centennialcollege.model.Enrollment;
import ca.centennialcollege.model.Program;
import ca.centennialcollege.model.Student;

public class EnrollmentService implements IEnrollmentService {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jovane_COMP303_Assignment2");

	private static EntityManager em = factory.createEntityManager();

	@Override
	public List<Enrollment> findAll() {
		List list = em.createQuery("select p from Program p").getResultList();
		return list;
	}

	public Enrollment findOne(Integer applicationNo) {
		Enrollment program = null;
		List list = em.createQuery("select p from Enrollment p where p.applicationNo = :applicationNo")
				.setParameter("applicationNo", applicationNo).getResultList();
		if (list.size() > 0) {
			program = (Enrollment) list.get(0);
		}
		return program;
	}

	@Override
	public Enrollment save(Enrollment enrollment) {
		em.getTransaction().begin();
		if (enrollment.getApplicationNo() == null) {
			System.out.println("Inserting new enrollment");
			em.persist(enrollment);
		} else {
			em.merge(enrollment);
			System.out.println("Updating existing enrollment");
		}
		em.getTransaction().commit();
		System.out.println("Enrollment saved with id: " + enrollment.getApplicationNo());
		return enrollment;
	}

}
