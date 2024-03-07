import java.util.Scanner
public class countCharacter {
	public static vaid main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter data");
	String s1=sc.next();
	char a[]=s1.toCharArray();
	int uppercasecount=0;
	int lowercasecount=0;
	int numbercount=0;
	int symbolcount=0;
	for(int i=0;i<a.length;i++)
	{
		if (a[i]>='A'&& a[i]<='Z')
		{
			 uppercasecount++;
		}
		else if(a[i]>='a'&& a[i]<='z)
			{
					lowercasecount++;	
			}
		else if(a[i]>='a'&& a[i]<='z)
			{
					
			}
	}
	

}
}
