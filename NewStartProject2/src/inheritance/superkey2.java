package inheritance;

public class superkey2 extends superkey{
	String s1="qspiders";
	
	

	public superkey2() {
		// TODO Auto-generated constructor stub
	}
	public void test()
	{ 
		System.out.println("from class superkey2");
	}
	public void display()
	{
		System.out.println(super.i);
		System.out.println(s1);
		super.test();
		
	}

}
