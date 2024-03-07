//crud operation

package hibernate_user.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_user.User;
 //persiste method is sql
public class UserDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void signupUser(User user)
	{
		entityTransaction.begin();
		entityManager.persist(user);//factory design pattern of java
		entityTransaction.commit();
	}
	public boolean loginUser(String email,String password)
	{
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		try {
			User user=(User) query.getSingleResult();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	public void displayPassword(String email) {
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 ");
		query.setParameter(1, email);
        User user=(User) query.getSingleResult();
        System.out.println("Facebook:"+user.getFaceBOOK());
        System.out.println("Instagram:"+user.getInstagram()); 
        System.out.println("snapchat:"+user.getSnapChat());
        System.out.println("twitter:"+user.getTwitter());
        System.out.println("whatsapp:"+user.getWhatsappp());
		

	}
	public void updatePassword(User user)
	{
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 ");
		query.setParameter(1, user.getEmail());
		 User dbuser=(User) query.getSingleResult();
		user.setId(dbuser.getId());
		user.setName(dbuser.getName());
		user.setPhone(dbuser.getPhone());
        entityTransaction.begin();
        entityManager.merge(user);
        entityTransaction.commit();
		
	}

}
