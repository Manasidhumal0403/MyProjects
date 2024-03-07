package task28;
import java.util.Scanner;
public class lastdiplicate{

	public static void main(String[] args)
	{
		Scanner l=new Scanner(System.in);
		System.out.println("Enter size of  array");
		
		int a[] = new int[l.nextInt()];
		for (int i=0;i<a.length;i++)
		{
			a[i]=l.nextInt();
		}
		for (int i=a.length-1;i>0;i--)
		{
			int count=0;
		
			if (a[i]!=0)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						a[j]=0;
						break;
					}
				}
			}
			if (count!=0)
			{
				System.out.println(a[i]);
				return;
			}
		}
	}
	
		
	    
	
	

	}


