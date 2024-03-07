package task29date;

public class CountEvenNumber {
public static void main(String[] args) {
		int a[]= {1,2,4,5,6,3,};
		int result=evencount(a);
		
		System.out.println(result);
}
		
		public static int evencount(int b[])
		{
			int ct=0;
			for (int i=0;i<b.length;i++)
			{ 
				if (b[i]%2==0)
				{
					ct++;
				}
				
			}
			return ct;
		}

	}


