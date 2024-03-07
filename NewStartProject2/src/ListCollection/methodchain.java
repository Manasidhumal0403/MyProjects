package ListCollection;

public class methodchain {
	String name="mango";
	int price;

	
	public String displayname() {
		System.out.println(name);
		return name;
	}
	public methodchain displayname1()
	{
		System.out.println(this);
		return this;
		
	}
	public int displayprice()
	{
		return price;
		
	}
	
	public methodchain price()
	{
		return this;
		
	}
	
	


}
