package task29date;
import java.util.Scanner;
public class countOddEvenElement {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int a=sc.nextInt();
	int []b= new int[a];
	for (int i=0;i<b.length;i++)
	{
		 b[i] = sc.nextInt();
	}
	counteven(b);

	
}
	
	public static void  counteven(int a[])
	{
		int evencount=0;
		int oddcount=0;
	
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				evencount++;
			}
			
			else
			{
				oddcount++;
			}
		}
		
	System.out.println(evencount);
	System.out.println(oddcount);
	}


		
		
	}


