import java.util.Scanner;

public class SecondMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a size");  
		 int [] a= new int [sc.nextInt()];
		  for (int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();//12 23 9 4
		  }                          
		  int fmin=a[0];  //12   
		  int semin=0;
		  for (int i=1;i<a.length;i++)   
		  {
			  if (fmin<a[i])  //12<23
			  {
				  a[i]=fmin;   //12
				  
			
				  
				  System.out.println(fmin);
			  }
		  }
		    
	}

}
