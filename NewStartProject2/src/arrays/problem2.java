package arrays;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];
		for (int i=0;i<a.length;i++)  //0<8
		{
			a[i]=sc.nextInt();//                     
		}                              
		
		for(int i=0;i<a.length;i++) 
		{
		int count=0;
	    if (a[i]!=0)
		{
	    	for(int j=i+1;j<=a.length;j++)
	    	{
	    		if (a[j]==a[i])
	    		{
	    			count++;
	    			a[j]=0;
	    			
	    			
	    		}
	
	    	}
    for (int k=1;k<count;k++)
    {
    	System.out.println(a[i]);
    }
}
}
}
}
