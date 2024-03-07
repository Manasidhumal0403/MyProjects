
package SingleLevelInheritance;

public class SavingAccount extends Account{
	double balance;
	double intrest;
	double limit;
	double minbalance;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	SavingAccount (String bank,String branch,long accno,String ifsc,String name,double balance,double intrest,double limit,double minbalance)
	{
		this.bank=bank;
		this.branch=branch;
		this.accno=accno;
		this.ifsc=ifsc;
		this.name=name;
		this.balance=balance;
		this.intrest=intrest;
		this.limit=limit;
		this.minbalance=balance;
		System.out.println("__________________________");
	}
	public void displaySavingAccount()
	{
		displayAccount();
		
		System.out.println("balance:"+balance);
		System.out.println("interest:"+intrest);
		System.out.println("limit:"+limit);
		System.out.println("minbalance:"+minbalance);
		
		
		
	}
	}

