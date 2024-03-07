package arrays;
import java.util.Scanner;
public class duplicate {
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
	
		if (a[i]!=0)  //1!=0
		{
			for(int j=i+1;j<a.length;j++)  //2
			{                               //j=1  1<9
				if (a[i]==a[j]) 
				{
					count1++;//3
					a[j]=0;//a[2]=0
				}
		

	}
		
		
			if (count1!=0)
			{
				count2++;//1
				System.out.println(count2);
}
}
}
}
}
