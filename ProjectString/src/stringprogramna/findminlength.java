package stringprogramna;
import java.util.Scanner;
public class findminlength {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.next();
	String a[]=s1.split(s1);
	System.out.println(smallest(a));
	
}
public static String smallest(String []a)
{
	int index=0;
	int minlength=a[0].length(); 
	for (int i=1;i<a.length;i++)
	{
		if (a[i].length() < minlength)
		{
			index = i;
			minlength=a[i].length();
		}
	}
	return a[index];

	}

}
