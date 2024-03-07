import java.util.Scanner;
public class StringProblem1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER SIZE OF ARRAY");
	String []a=new String[sc.nextInt()];
	for (int i=0;i<a.length;i++)
	{
	 a[i]=sc.nextLine();
	
	}
	
	for (int i=0;i<=a.length;i++)
	{
		int count=0;
		if (a[i]!=null)
		{
		for (int j=i+1;j<i;j++)
			
		{
			if (a[i].equals(a[j]))
			{
			count++;
			a[j]=a[i];
		}
}
	System.out.println(a[i]);
}
}
}
}
