package ListCollection;

import java.util.Arrays;

public class ipl {

	
	
	String team;
	int points;
	char [] last;
	
	public ipl() {
		// TODO Auto-generated constructor stub
	}
	public ipl(String team, int points,char[] last) {
		super();
		this.team = team;
		this.points = points;
		this.last = last;
	}
	@Override
	public String toString() {
		return "ipl [team=" + team + ", points=" + points + ", last=" + Arrays.toString(last) + "]";
	}
	
	

}
