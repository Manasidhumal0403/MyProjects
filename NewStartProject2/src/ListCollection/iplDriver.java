package ListCollection;
import java.util.ArrayList;
import java.util.Iterator;
public class iplDriver {
public iplDriver() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<ipl> Match= new ArrayList();
  
  Match.add(new ipl("LSG",18, new char[] {'w','l','l','w','w'}));
  Match.add(new ipl("RR",16, new char[] {'w','w','w','l','w'}));
  Match.add(new ipl("DC",14, new char[] {'w','w','l','l','w'}));
  Match.add(new ipl("RCB",14, new char[] {'w','w','l','l','w'}));
  Match.add(new ipl("KKR",12, new char[] {'w','w','l','l','w'}));
  Match.add(new ipl("SRH",12, new char[] {'w','w','l','l','w'}));
  
  
  System.out.println(Match);
  consecutive(Match,3,'w');
	}
	public static void consecutive(ArrayList<ipl> Match, int n,char ch)
	{
		
		for (ipl i: Match)
		{
			int count=0;
			
			for (int j=0;j<i.last.length;j++)
			{
				if(i.last[j]==ch)
				{
					count++;
					if (count==n)
					{
						break;
					}
				}
				else
				{
					count=0;
				}
			}
			if (count==n)
			{
				System.out.println(i.team);
			}
		}
		
	}
}
				
			
