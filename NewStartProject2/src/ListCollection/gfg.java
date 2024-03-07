package ListCollection;

public class gfg {

	public gfg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upcastinganddowncasting var=new child();
		var.name="vinayy";
		
		System.out.println(var.name);  ///upcasting
		child var2=(child)var; 
		//downcasting
		
		var2.a=12;
		var2.name="hii";     //  
		System.out.println(var2.a);
		System.out.println(var2.name);
	}

}
