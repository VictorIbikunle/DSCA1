package dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Deposit;




public class DepositDAO {
	
	protected static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("VictorPU"); 	
	

public DepositDAO() {
		
	}




public void persist(Deposit Deposit) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(Deposit);
	em.getTransaction().commit();
	em.close();
}


public void remove(Deposit Deposit) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.remove(em.merge(Deposit));
	em.getTransaction().commit();
	em.close();
}

public Deposit merge(Deposit Deposit) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	Deposit updatedDeposit = em.merge(Deposit);
	em.getTransaction().commit();
	em.close();
	return updatedDeposit;
}



	
}