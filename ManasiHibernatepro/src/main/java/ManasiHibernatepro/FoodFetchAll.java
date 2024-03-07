package ManasiHibernatepro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.mapping.List;

import com.mysql.cj.Query;

public class FoodFetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		  javax.persistence.Query query=entityManager.createQuery("SELECT F FROM Food F");
		java.util.List list  =  query.getResultList();
		System.out.println(list);

	}

}
