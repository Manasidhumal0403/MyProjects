package Relationships;

public class Car {
	String brand;
	String colour;
	double price;
	String type;
	Engine eng = new Engine ("petrol",1200,91,100,4,4);
	 public Car ()
	 {}
		 Car (String brand,String colour,double price,String type)
		 {
			this.brand=brand;
			this.price=price;
			this.colour=colour;
			this.type=type;
			
		 }
		 public void displayCar()
		 {
			 System.out.println("brand"+brand);
			 System.out.println("colour"+colour);
			 System.out.println("price"+price);
			 System.out.println("type"+type);
		     System.out.println("____________________________");
		 }
	 
		

}
