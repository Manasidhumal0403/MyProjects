package hibernate_pejm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class EmployeeInsert {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee employee=new Employee();
	
	employee.setId(2);
	employee.setName("sam");
	employee.setPhone(8880196719l);
	employee.setEmail("sam@gmail.com");
	employee.setPassword("1234");
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();	
	entityTransaction.begin();
	entityManager.persist(employee);
	entityTransaction.commit();
}

}
