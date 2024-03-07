package arrays;
import java.util.Scanner;
public class peoblem1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];
		for (int i=0;i<a.length;i++)  //0<8
		{
			a[i]=sc.nextInt();//                     
		}                              
		
		for(int i=0;i<a.length;i++) 
		{
			int sum=0;
	   while (a[i]!=0)
	   {
		   int rem=0;
		   rem = a[i]%10; 
		      sum+=rem;
		   a[i]/=10;
	   }
	   if (sum%2==0)
	   {
       System.out.println("true");  //return true;
	}
	   else 
	   {
      System.out.println("false");
}
}
	}
}
	
