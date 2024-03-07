package encapsulation;

public class AccountDriver {
	public static void main(String[] args) {
		Account a1 = new Account("sbi bank",1234567891,"sbi0034","deccan","manasi",500000.00,1234,"saving",34545455);
	   a1.getPin(1234567891,1234);
	a1.displayAccount();
	a1.getName();
	}
}
	

