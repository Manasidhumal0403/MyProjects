package hibernate_oneToOne_uni_pesa9.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AadharCardDao {
	 {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rajath");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
public boolean AadharCard()
		
			entityTransaction.begin();
			entityManager.remove(aadharCard);
			entityTransaction.commit();
		}

public void updateAadharCard(int i) {
	// TODO Auto-generated method stub
	
}

	}


}
