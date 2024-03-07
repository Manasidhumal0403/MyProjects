package Relationships;

public class Engine {


String fuel;
int cc;
double bhp;
int wt;
int cy;
int stroke;
public Engine () {
}
Engine (String fuel,int cc,double bhp,int wt,int cy,int stroke){
	this.fuel=fuel;
	this.cc=cc;
	this.bhp=bhp;
	this.wt=wt;
	this.cy=cy;
	this.stroke=stroke;
	
}
public void displayEngine()
{
	System.out.println("fuel:"+fuel);
	System.out.println("cc:"+cc);
	System.out.println("bhp:"+bhp);
	System.out.println("wt:"+wt);
	System.out.println("cy:"+cy);
	System.out.println("stroke:"+stroke);
	
	
}
}