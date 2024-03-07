package Assignment24;


public class pangram1 {

	public static void main(String[] args) {
	String s1="yellow".toLowerCase();
	char[]ch=s1.toCharArray();
	int count=0;
	for (int i=0;i<ch.length;i++)
	{
		char b=ch[i];
		
	    if(b=='a'|| b=='e'|| b=='o'|| b=='i'|| b=='u')
	    {
	    	count++;
	    	
	    	
	    }
	   
	   
	}
	 System.out.println(count);
	    }
	 
	}

	

