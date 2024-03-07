package task29date;

public class Averageofanelement {

public static void  main(String[] args) 
{
	int a[]= {2,4,6,6,2,3,9,9};   //23+18=41;  //41/8
	int result=avg(a);
	System.out.println(result);
}
			
public static int avg(int b[])
{
int count=0;
int sum=0;
int avg=0;

for (int i=0;i<b.length;i++)
		{
			count++;
			sum=sum+b[i];
			
		}
		avg=sum/count;
		
		return avg ;

		}
					

}

