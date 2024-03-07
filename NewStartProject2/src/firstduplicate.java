import java.util.Arrays;

public class firstduplicate {
	
public static void main(String[]args)
{
	int a[]= {6,0,6,1,2,2,1,0,9,3,2,3,3,3};
	int[] ans=removeDuplicate(a[]);
	System.out.println(Arrays.toString(ans));
}
public static int[] removeDuplicate(int ip[])
	{
	
	int count[]=frequency(ip[]);
	int neg=0;
	for (int i=0;i<count.length;i++)
	{
		if (count[i]==-1)
		{
			neg++;
		}
	}
		int unique[]=new int[ip.length-neg];
		int j=0;
		for (int i=0;i<ip.length;i++)
		{
			if (count[i]!=-1)
			{
				unique[j]=ip[i];
				j++;
			}
		}
		return unique;
	}
public static int[] frequency(int a[])
{
	int count[]=new int[a.length];
	for (int i=0;i<count.length-1;i++)
	{
		int ct=1;
		for (int j=i+1;j<count.length;j++)
		{
			if (a[i]==a[j])
			{
				ct++;
				count[j]=-1;
			}
		}
		if (ct !=0)
		{
			count[i]=ct;
		}
	}
	return count;
}
}


