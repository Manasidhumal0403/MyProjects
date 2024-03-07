package hibernate_pejm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
		EntityManager entityManager=entityManagerFactory.createEntityManager()
;		
		
		Employee employee=entityManager.find(Employee.class,1);
		System.out.println(employee);
		

	}

}
