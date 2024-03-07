package com.sendmail;



import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Auth extends Authenticator {
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// TODO Auto-generated method stub
		return new PasswordAuthentication("manasidhumal10@gmail.com", "bixobuntcedatfpw");
	}
	

}

