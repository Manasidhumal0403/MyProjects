import java.util.Scanner;
class FindFirstMaxNumber {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a size");  
 int [] a= new int [sc.nextInt()];
  for (int i=0;i<a.length;i++)
  {
	  a[i]=sc.nextInt();//12 34 45 12
  }
  int FirstMax=a[0];   //
  int SecondMax=0;      //0
  for (int i=0;i<a.length;i++)  //2<4
  {
      if (a[i]>FirstMax)  //34>12
      {
    	  FirstMax=a[i];  //45
      }
	  
	}
  for (int j=1;j<a.length;j++)
  {
	  if (a[j]<SecondMax && FirstMax!=a[j])
	  {
		  SecondMax=a[j];
	  }
  }
  
 System.out.println(FirstMax);//45
 System.out.println(SecondMax);
}

}

