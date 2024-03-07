package task28;
import java.util.Scanner;
public class duplicate  {

public static void main(String[] args) {
 Scanner l = new Scanner(System.in);
	System.out.println("Enter size of  array");
	int a = l.nextInt();
	int [] b =new int[a];
	for (int i=0;i<b.length;i++)
	{
		b[i]=l.nextInt();
	}
	for (int i=0;i<b.length;i++)
	{
		int count=0;
	
		if (b[i]!=0)
		{
			for (int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					count++;
					b[j]=0;
					break;
				}
			}
		}
		if (count!=0)
		{
			System.out.println(b[i]);
	}
}
}

}
