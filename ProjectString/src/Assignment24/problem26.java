package Assignment24;
import java.util.Scanner;
public class problem26 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String s1=sc.next();
	System.out.println("enter second string");
	String s2=sc.next();
	char[]a=s1.toCharArray();  //k e e p
	char[]b=s2.toCharArray();  //p e a     k
	int count=0;
	for  (int i=0;i<a.length;i++)//k
	{
		
	    for (int j=b.length-1;j<=0;j--)//k
	    {
	       if (a[i]==b[j]);//k present
	    	{
	    		count++;
	          b[j]='\u0000';
	    		
	    	}
	    }
	    
	}
	if (count==a.length)
	{
	    System.out.println("it is ");
	}
	}
}

}
