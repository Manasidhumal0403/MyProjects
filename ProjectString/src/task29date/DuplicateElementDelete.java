package task29date;
import java.util.Arrays;
import java.util.Scanner;
public class DuplicateElementDelete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int a=sc.nextInt();
	int []b= new int[a];
	for (int i=0;i<b.length;i++)
	{
		 b[i] = sc.nextInt();
	}
	
	int ans[]=removeduplicate(b);
	System.out.println(Arrays.toString(ans));

	
}
	
	public static int[]  frequency(int a[])
	{
		int count1[]=new int[a.length];  
		for (int i=0;i<count1.length;i++)
		{
			int count=1;
			for (int j=i+1;j<count1.length;j++)
			{
			   if (a[i]==a[j])
			{ 
				   count++;
			       a[j]=0;
			}
			}
			if (count!=-1)
			{
			count1[i]=count;	
			  
		}
		}
		 return count1;
		}

public static int [] removeduplicate(int []b)
{
	    int count2[]= frequency(b);
	    int neg=0;
	    for (int k=0;k<count2.length;k++)
	    {
	    	if (count2[k]==-1)
	    	{
	    		neg++;
	    	}
	    }
	    int unique[]=new int [count2.length-neg];
	    int m=0;
	    for (int n=0;n<count2.length;n++)
	    {
	    	if (count2[n]!=-1)
	    	{
	    		unique[m]=b[n];
	    		m++;
	    	}
	    }
	    return unique;
}

	

}


