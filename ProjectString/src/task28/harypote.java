package task28;

import java.util.Iterator;

public class harypote {


	public static void main(String[] args) {
	String s1="harry potter";
	String b=" ";
	char ch[]=s1.toCharArray();
	for (int i=0;i<ch.length;i++)
	{
		if (ch[i]!='\u0000'&&ch[i]!=' ')
		{
			for (int j=i+1;j<ch.length;j++)
			{
				if (ch[i]==ch[j])
				{
					 ch[j]='\u0000'; 
				}
			}
			b=b+ch[i];
		}
	}
	System.out.println("without sorting");
	System.out.println(b);
	System.out.println("after sorting");
	char [] ch2=b.toCharArray();
	for (int i=0;i<ch2.length;i++)
	{
		for (int j=i+1;j<ch2.length;j++)
		{
			if (ch2[i]>ch2[j])  //change symbol greater
			{
			char temp=ch2[i];
			ch2[i]=ch2[j];
			ch2[j]=temp;
			}
		}
	}
	for (int i=0;i<ch2.length;i++)
	{
		System.out.print(ch2[i]+" ");
	}
	}

}
