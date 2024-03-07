package hibernate_oneToOne_uni_pesa9.controller;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_oneToOne_uni_pesa9.dao.AadharCardDao;
import hibernate_oneToOne_uni_pesa9.dao.PersonDao;
import hibernate_oneToOne_uni_pesa9.dto.AadharCard;
import hibernate_oneToOne_uni_pesa9.dto.Person;

public class MainController {
	public static void main(String[] args) {
		AadharCard aadharCard=new AadharCard();
		aadharCard.setId(101);
		aadharCard.setName("manasi");
		aadharCard.setAddress("pune");
		
	   Person person=new Person();
	   person.setId(1);
	   person.setName("sam");
	   person.setPhone(1882991910);
	   person.setAddress("KA");
	   person.setAadharCard(aadharCard);
	
	   EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
	   EntityManager entityManager=entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction=entityManager.getTransaction();
	   entityTransaction.begin();
	   entityManager.persist(aadharCard);
	   entityManager.persist(person);
	   entityTransaction.commit();
	  
	   
	   AadharCardDao aadharCardDao=new AadharCardDao();
	   PersonDao personDao=new PersonDao();
	   
	   personDao.savePerson(person);
	  personDao.updateBoth(1,person);//which id pass here
	 
	   
	   
	}

}
