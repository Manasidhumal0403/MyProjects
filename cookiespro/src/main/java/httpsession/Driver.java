//singletone class  29/08/2023
package httpsession;

public class Driver {
	public static void main(String[] args) {
		A a=A.getSingletoneClass();
		A a1=A.getSingletoneClass();
		System.out.println(a);
		System.out.println(a1);
		//here we get same object reference in single tone class.
		//in singletone class we create only one objet we are used this class in httpsession
		//httpsession.A@626b2d4a
		//httpsession.A@626b2d4a
	}

}
