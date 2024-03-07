package inheritance;

public class superkeyDriver {

	public superkeyDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkey2 a = new superkey2();
		 a.display();
		System.out.println(a instanceof superkey);
		superkey b= new superkey();
		System.out.println(b instanceof superkey);
		}
}
