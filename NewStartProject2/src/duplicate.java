import java.util.Scanner;

public class duplicate {

		public static void main(String[] args)
		{

				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
			       int size=sc.nextInt();
					int []arr=new int [size];
					for(int i=0;i<arr.length;i++)  
					{
						arr[i]=sc.nextInt();
					}
					int count2=0;
						for (int i=0;i<arr.length;i++)
						{
							int count1=1;
							if (arr[i]!=0)
							{
								for (int j=i+1;j<=arr.length;j++)
								{
									if (arr[i]==arr[j])
									{
										count1++;
										arr[j]=0;
									}
								}
									if (count1!=0)
									{
									count2++;
								}
							
}

}
						System.out.println(count2);
				}

}