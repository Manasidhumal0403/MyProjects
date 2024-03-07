package Relationships;

public class Computer {

	String brand;
	String os;
	String processor;
	int ram;
	int rom;
	Pendrive P;
	public Computer ()
	{
		
	}
	Computer (String brand,String os,String processor,int ram,int rom)
	{
		this.brand=brand;
		this.os=os;
		this.processor=processor;
		this.ram=ram;
		this.rom=rom;
		
	}
	public void insertPendrive (String name,int size,double price)
	{
		P = new Pendrive (name,size,price);
				System.out.println("pendrive inserted!");
	}
	public void displayComputer ()
	{
		System.out.println("brand:"+brand);
		System.out.println("os:"+os);
		System.out.println("processor:"+processor);
		System.out.println("ram:"+ram);
		System.out.println("rom:"+rom);
		
	}

}
