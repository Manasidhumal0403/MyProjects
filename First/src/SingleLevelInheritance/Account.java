package SingleLevelInheritance;

public class Account {
  String bank;
  String branch;
  long accno;
  String ifsc;
  String name;
  

	public Account() {
		// TODO Auto-generated constructor stub
	}
	Account (String bank,String branch , long accno,String ifsc,String name)
	{
		this.bank=bank;
		this.branch=branch;
		this.accno=accno;
		this.ifsc=ifsc;
		this.name=name;
		  System.out.println("Account created!");
		  
	}
     public void displayAccount()
     {
    	 System.out.println("bank:"+bank);
    	 System.out.println("branch:"+branch);
    	 System.out.println("accno:"+accno);
    	 System.out.println("ifsc"+ifsc);
    	 System.out.println("name:"+name);
    	 
    	 System.out.println("----------------------------------------------");
     }
	

}
