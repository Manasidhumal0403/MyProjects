package Assignment24;

public class firstduplicatechar {
	public static void main(String[] args) {
		String s="hellowelcome";
		char[]a=s.toCharArray();
		char []b=a;
		//for (int i=0;i<=b.length;i++) {
			//System.out.println(b[i]);
		
		
 for (int i=b.length-1;i>=0;i++)
{
	int ct=0;
	if(b[i]!='\u0000')
	{
	 for(int j=b.length-1;j>=0;j++)
	 {
		if(b[i]==b[j])	
    {
	ct++;
	b[j]='\u0000';
	
		}
	 }
	 if(ct!=0)
	 {
		 System.out.println(a[i]);
	 }
}
	}
}
}

