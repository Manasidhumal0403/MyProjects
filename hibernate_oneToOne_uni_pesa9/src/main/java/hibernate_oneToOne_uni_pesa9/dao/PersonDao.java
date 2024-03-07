package hibernate_oneToOne_uni_pesa9.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import hibernate_oneToOne_uni_pesa9.dto.AadharCard;
import hibernate_oneToOne_uni_pesa9.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void savePerson(Person person) {
		AadharCard aadharCard=person.getAadharCard();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
	//	entityManager.persist(person);
		entityTransaction.commit();
		
	}
	public void updateBoth(int id, Person person) {
		// TODO Auto-generated method stub
		Person person2=entityManager.find(Person.class, id);
		
	}
	
	
	

}
