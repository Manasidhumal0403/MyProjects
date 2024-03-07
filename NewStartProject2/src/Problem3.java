
public class Problem3
{

	public static void main(String[] args) {
		
	
		String a[]={"hi","hello","hello","harry","kavin","speed","Avenger","tom","tom","Tom"};
		for (int i=a.length-1;i<a.length;i--)
		{
			int count=0;
			if (a[i]!=null)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i].equals(a[j]))
					{
						System.out.println(a[i]);
						return;
						
					}
			}
				
		

	}

}
}
}
