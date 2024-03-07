package encapsulation;

public class Account
{
	private String bank;
	private long accno;
	private String ifsc;
	private String branch;
	private String name;
	private double balance;
	private int pin;
	private String type;
	private long phno;
	 public Account ()
	 {
	 }
	 public Account (String bank,long accno,String ifsc,String branch,String name,double balance,int pin,String type,long phno)
	 {
		 this.bank=bank;
		 this.accno=accno;
		 this.ifsc=ifsc;
		 this.branch=branch;
		 this.name=name;
		 this.balance=balance;
		 this.pin=pin;
		 this.type=type;
		 this.phno=phno;
		System.out.println("Account created!");
		 
	 }
	 public void getPin(long accno,int pin )
	 {
		 System.out.println("pin is here"+pin);
	 }
	 public String getName()
	 {
		 System.out.println("name is here"+name);
		 return name;
	 }
	 public void displayAccount()
	 {
		 System.out.println("BANK:"+bank);
		 System.out.println("ACCOUNT NUMBER:"+accno);
		 System.out.println("IFSC:"+ifsc);
		 System.out.println("BRANCH:"+branch);
		 System.out.println("NAME:"+name);
		 System.out.println("BALANCE:"+balance);
		 System.out.println("PIN:"+pin);
		 System.out.println("TYPE:"+type);
		 System.out.println("PHNO:"+phno);
	 }
	 }

	 
	
	
	