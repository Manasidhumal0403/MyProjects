package stringprogramna;
import java.util.Scanner;
public class minlength {
	 public static void main(String[] args) {
		 String s1="iasdd adddm learning ssd programming";
	        String [] a = s1.split(" ");

	        System.out.println("The shortest word is = " + smallest(a));
	    }

	    public static String smallest(String a[]) {
	        //Keep track of the shortest word by index and length
	        int index = 0, minLength = a[0].length(); //8
	        for (int i = 1; i < a.length; i++){
	            //if the next string is smaller in length then we save that index and length in our variables
	          
	        	
	        	
	        	if(a[i].length() < minLength)  // 1<8
	            {
	                index = i;//2
	                minLength = a[i].length();  //1
	            }           
	        }
	        //returns the smallest word
	        return a[index];
	    }

	

	

}

