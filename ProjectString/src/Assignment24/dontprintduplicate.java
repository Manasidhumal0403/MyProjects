package Assignment24;

public class dontprintduplicate {

	public static void main(String[] args) {
		String s1="csharpstarz";
		char[]ch=s1.toCharArray();
		frequency(ch);
	   }
	  
		public static char[] frequency(char []a)
		{
		char[] ch2=new char[a.length];
		for (int i=0;i<a.length;i++)
		{
	        
			for (int j=i+1;j<a.length;j++) 
	         {
	        	 if (a[i]!=a[j])
	        	 {
	        		 a[j]='\u0000';
	         }
	        }
		return ch2;
		}
        }
		
		
		
		


		

					
					
	
