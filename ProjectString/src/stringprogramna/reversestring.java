package stringprogramna;
//import java.util.Scanner;
public class reversestring {
public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in); 
		//String a =sc.nextLine();
	String s1="hello guys";
	String s2 []= s1.split(" ");
	//	String s2[]=new Strinnext());
		
		
		for (int i=0;i<=s2.length;i++)
		{
		isReverse(s2[i]);
			//String b=s2[i];
			//System.out.print(b);
		}
}
			public static void isReverse(String a)
			{
			for (int j=a.length()-1;j>=0;j--)
			{
				System.out.print(a.charAt(j));
			}
			System.out.println(" ");
		}
}





