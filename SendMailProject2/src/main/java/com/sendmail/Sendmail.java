package com.sendmail;

import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Sendmail {

	public static void main(String[] args) throws MessagingException
	{
		Scanner scanner=new Scanner(System.in);
		String from="manasidhumal10@gmail.com";
		String to=scanner.next();//add recipent
		
//		System.out.println("ENTER NUMBER OF mails to be sent");
//		int count = new Scanner(System.in).nextInt();
//		
//		for (int i=0;i<count;i++)
//		{
//			Random random = new Random();
//			int otp =random.nextInt(10000);
		
		
		Properties properties=System.getProperties();
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");//setting the properties f smtp to sent mail
		
		Session session=Session.getInstance(properties,new Auth());//providing login credential through authenticator implememting class to session
		
		session.setDebug(true);
		
		InternetAddress address=new InternetAddress(from);
        InternetAddress address2=new InternetAddress(to);
        
        
        //with the help of internetaddress class we are converting string type of mail addressinto actual email address
        
        
        MimeMessage message=new MimeMessage(session);
        
        message.setFrom(address);
        message.addRecipient(RecipientType.TO,address2);
        System.out.println("enter a subject");
        String subject=scanner.next();
        message.setSubject(subject);
        System.out.println("enter a message");
        String message1=scanner.next();
      
 
       message.setText(message1);
        
        Transport.send(message);
        
        //send() is used to send message/mail 
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}

