package Relationships;

public class Pendrive {

	String name;
	int size;
	double price;
	public Pendrive() {
		// TODO Auto-generated constructor stub
	}
	
	public Pendrive (String name,int size,double price) {
		this.name = name;
		this.size = size;
		this.price = price;
		
	}
	
	public void displayPendrive ()
	{
		System.out.println("brand:"+name);
		System.out.println("price:"+price);
		System.out.println("size:"+size);
		System.out.println("--------------------------");
	}
	
	

}
