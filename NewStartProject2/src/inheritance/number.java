package inheritance;
import java.util.Scanner;

public class number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,i,count = 0,rev=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    x=sc.nextInt();
     while (x>0)
     {
    	 y = x%10;//4
    	  rev =(rev*10)+y;
    	   x/=10;
    	   
    
    	  
    }
     System.out.println(rev);
     }
   
    
}



