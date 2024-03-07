package stringprogramna;
import java.util.Scanner;
public class stringtoarraysplitfindlength {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2[]=s1.split(" ");
		for (int i=0;i<s2.length;i++)
		{
			int ans=m1(s2[i]);
			System.out.println(ans);
		}
	}
	public static int m1(String a)
	{
		return a.length();
	}
	}
