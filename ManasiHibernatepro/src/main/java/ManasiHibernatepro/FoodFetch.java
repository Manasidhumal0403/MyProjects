package ManasiHibernatepro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FoodFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Food food= entityManager.find(Food.class, 1);
		System.out.println(food);//tostring method in entity class
		
		// now i inserted another food
		//again i have to fetch all food itm
	}

}
