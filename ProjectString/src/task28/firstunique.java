package task28;

public class firstunique {
public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,3,4,2,1,2,34};
		
for (int i=0;i<a.length;i++)
{
	int ct=0;
	if (a[i]!=0)
	{
	for (int j=i+1;j<a.length;j++)
	{
		if (a[i]==a[j])
		{
			
			ct++;
		  
		}
		
	}
	if (ct==0)
	{
		System.out.println(a[i]);
		return;
		
	}
	
	
	}
}

}
}

