package inheritance;

public class test2 extends test1{

	public test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
test1 obj=new test1();

System.out.println(obj.i);
System.out.println(obj.s1);
obj.s1="hello";
System.out.println(obj.s1);
System.out.println(test1.s1);
test2 obj2= new test2();
System.out.println(obj2.s1);

	}

}
