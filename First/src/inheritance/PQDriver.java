package inheritance;

public class PQDriver {

	public PQDriver() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		Q q1=new Q();
		q1.disply();
		System.out.println(q1 instanceof Q);
		P p2= new P();
		System.out.println(p2 instanceof Q);
		P p1 = new P();
		System.out.println(p1 instanceof P);
		
	}

}
