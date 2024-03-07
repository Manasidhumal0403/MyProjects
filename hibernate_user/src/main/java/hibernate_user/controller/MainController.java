package hibernate_user.controller;

import java.util.Scanner;
import hibernate_user.dao.UserDao;
import hibernate_user.User;
public class MainController {

	public static void main(String[] args) {
		User user=new User();
		UserDao dao=new UserDao();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the choice \n1.Signup \n2. Login");
		int choice =scanner.nextInt();
		switch (choice) {
		case 1:
		{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
			System.out.println("Ente the name");
			String name=scanner.next();
			System.out.println("Ente the phone");
			long phone =scanner.nextInt();
			System.out.println("Ente the email");
			String email=scanner.next();
			System.out.println("Ente the password");
			String  password=scanner.next();
		
			
			user.setId(id);
			user.setName(name);
			user.setPhone(phone);
			user.setEmail(email);
			user.setPassword(password);
			dao.signupUser(user);
			
		}
			break;
		case 2:
		{
			System.out.println("Ente the email");
			String email=scanner.next();
			System.out.println("Ente the password");
			String  password=scanner.next();
			boolean result=dao.loginUser(email, password);
			if (result)
			{
				System.out.println("login succesfully");
				dao.displayPassword(email);
				System.out.println("Enter the choice \n1.update password \n2.logout");
				int key =scanner.nextInt();
				switch (key) {
				case 1:
				{
					System.out.println("enter a facebook password");
					String facebook=scanner.next();
					System.out.println("enter a instagram password");
					String instagram=scanner.next();
					System.out.println("enter a snapchat password");
					String snapchat=scanner.next();
					System.out.println("enter a twitter password");
					String twitter=scanner.next();
					System.out.println("enter a whatsapp password");
					String whatsapp=scanner.next();
					user.setFaceBOOK(facebook);
					user.setInstagram(instagram);
					user.setSnapChat(snapchat);
					user.setTwitter(twitter);
					user.setWhatsappp(whatsapp);
					user.setEmail(email);
					user.setPassword(password);
					dao.updatePassword(user);
					
				}
					
					break;
				case 2:
				{
					break;
				}

				default:
					break;
				}
			}
			else
			{
				System.out.println("invalid credential");
			}
		}
		break;
		
		

		default:
			break;
		}
		

	}

}
