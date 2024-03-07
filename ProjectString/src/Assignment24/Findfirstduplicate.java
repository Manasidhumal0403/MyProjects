package Assignment24;

public class Findfirstduplicate {

	public static void main (String[]args) {
		String a[]= {"hi","hello","hello","Hello","Speed","kavin","Avenger","tom","tom","Tom"};
		
		for (int i=a.length-1;i>0;i--)
		{
			int count=0;
		    if(a[i]!=null)
				for (int j=0;j<a.length;j++) {
					if(a[i].equals(a[j]))
					{
						count++;
						a[j]=null;
					}
					
				}
			if (count!=0)
					{
				System.out.println(a[i]);
					}
		}
	}
}


