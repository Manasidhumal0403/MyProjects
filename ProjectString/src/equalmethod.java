
public class equalmethod {
	String a;
    String b;
	equalmethod(String a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
	
  equalmethod e1=new equalmethod("hello");
  equalmethod e2=new equalmethod("hello");
  
  System.out.println(e2.equal(e1));
	}
	public boolean equal(Object o)
	{
		equalmethod e1=(equalmethod)o;
		String a=this.a;
		String b=this.b;
		if (a.length()==b.length())
		{
			for (int i=0;)
		}
	}

}
