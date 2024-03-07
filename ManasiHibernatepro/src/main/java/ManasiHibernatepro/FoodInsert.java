package ManasiHibernatepro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FoodInsert {

	public static void main(String[] args) {
		
		Food food=new Food();
		food.setFoodId(3);
		food.setFoodName("varan bhat");
		// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
 entityTransaction.begin();
 entityManager.persist(food);
 entityTransaction.commit();
	}

}
