package inheritance;

public class methoddriver {

	public methoddriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		methodoverriding obj=new methodoverriding2();
//		
//		obj.best();
//		obj.worst();
//		System.out.println(obj.ch);//variable shadowing
//		System.out.println(obj.s);//variable shadowing 
		methodoverriding2 obj2=new methodoverriding2();
		obj2.best();
		obj2.worst();
		System.out.println(obj2.s);
		System.out.println(obj2.ch);
		

	}

}
