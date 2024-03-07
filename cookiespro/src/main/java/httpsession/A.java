
//singletone class  29/08/2023
package httpsession;

public class A {
	private static A a;
private A()
{
	
}
public static A getSingletoneClass()
{
	if (a !=null)
	{
		return a;
	}
	else
	{
		a=new A();
		return a;
	}
}
}
