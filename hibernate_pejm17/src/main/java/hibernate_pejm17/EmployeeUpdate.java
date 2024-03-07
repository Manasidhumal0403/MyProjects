package hibernate_pejm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.setId(1);
//		employee.setName("sam");
//		employee.setPhone(1828823);
//		employee.setEmail("sam@gmail.com");
//		employee.setPassword("23456");
//		
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
//		EntityManager entityManager=entityManagerFactory.createEntityManager();//here merger method is present
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		
//		
//		entityTransaction.begin();
//		entityManager.merge(employee);//merge accept 
		//theobject
		//merge mwthod polymorphic nature  
		//it always dpends on the primary key
		//if the primary key is already present it act like update query.if the primary key is not avilable it act like insert query
		//entityTransaction.commit();
		
		//To update specific data
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee=entityManager.find(Employee.class, 1);
		if (employee!=null)
		{
			employee.setName("aish");
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			}
		else
		{
			System.out.println("id not found");
		}
		
		
		
		
	}

}
