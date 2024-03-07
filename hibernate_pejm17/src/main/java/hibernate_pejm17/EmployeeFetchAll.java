package hibernate_pejm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

//import org.hibernate.mapping.List;
//import org.hibernate.query.Query;

public class EmployeeFetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//using jpql java persistence query language
		Query query=entityManager.createQuery("SELECT e FROM Employee e");//e is variable
	List<Employee> list= query.getResultList();
	System.out.println(list);

	}

}
