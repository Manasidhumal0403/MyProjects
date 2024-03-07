
public class biggestlength {

	public static void main(String[]args){
		 String s1=" i am learning programs";
		 String []s2 = s1.split(" ");
		int min=0;
		
		
		 for (int i=0;i<s2.length;i++)
		 { 
		 
			 {
			if (min<=s2[i].length())
			{
				min=s2[i].length();			}
		 }
			 
		 }
		 for (int i=0;i<s2.length;i++)
		 {
   if (s2[i].length()==min)
   {
	   System.out.println(s2[i]);
   }

}
	}
}
