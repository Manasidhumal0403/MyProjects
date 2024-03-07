package hibernate_pejm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//attempt to create delete event with null entity
//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
//EntityManager entityManager=entityManagerFactory.createEntityManager();
//EntityTransaction entityTransaction=entityManager.getTransaction();
//Employee employee=entityManager.find(Employee.class, 2);
//entityTransaction.begin();
//entityManager.remove(employee);
//entityTransaction.commit();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, 2);
		if (employee != null) {
		entityTransaction.begin();
		entityManager.remove(employee);
	entityTransaction.commit();
		}
		else
		{
			System.out.println("id not found");
		}
		

}

}
