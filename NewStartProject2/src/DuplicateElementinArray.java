import java.util.Scanner;

public class DuplicateElementinArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a size");
     int size=sc.nextInt();
	String []arr=new String [size];
	for(int i=0;i<arr.length;i++)  //0<5
	{
		String 
		
	}
	for (int i=0;i<arr.length;i++)
	{
		int count=0;
		
		if (arr[i]!=null)
		{
			for (int j=i+1; j<arr.length;j++)
			{
				if (arr[i].equals(arr[j]))
				{
				     count++;
					arr[j]=null;
				}
			}
			if (count!=0)
			{
			System.out.println(arr[i]);
			
		}
	}

}
}




	}

}
