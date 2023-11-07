package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import entities.loan;

public class loanDAO {
	
	protected static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("VictorPU"); 	
	

public loanDAO() {
		
	}




public void persist(loan loan) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(loan);
	em.getTransaction().commit();
	em.close();
}


public void remove(loan loan) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.remove(em.merge(loan));
	em.getTransaction().commit();
	em.close();
}

public loan merge(loan loan) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	loan updatedloan = em.merge(loan);
	em.getTransaction().commit();
	em.close();
	return updatedloan;
}







	
}