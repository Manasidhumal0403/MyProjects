package ListCollection;
//import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Fruitvegcollection {

public static void main(String[] args) {
		
ArrayList fruit = new ArrayList();
ArrayList veg= new ArrayList();


fruit.add("mango");
fruit.add("Apple");
fruit.add("waterMEllon");
fruit.add("Banana");
fruit.add("jackfruit");


System.out.println(fruit);
veg.add("cucumber");
veg.add("cucumber");
veg.add("curry leaves");
veg.add("coriander");
veg.add("Brinjali");
veg.add("Radish");
System.out.println(veg);

ArrayList<String> shop =new ArrayList();
shop.addAll(fruit);
shop.addAll(veg);
System.out.println(shop);
if (shop.contains("cucumber"))
{
	//shop.remove("cucumber");    remove element
	//shop.removeAll(veg);
	//remove colllection
	//shop.remove(5);
	//shop.remove(6);
	
	//same element at 5 and 6 index that why it remove 7 index element
	//shop.removeAll("cucumber");
	System.out.println(shop);

	
	
}





//if (shop.contains("cucumber"))
//{
	////shop.remove("cucumber");    remove element
	//shop.removeAll(veg);    //remove colllection
shop.remove(5);
shop.remove(6);
	//System.out.println(shop);
	
	
//}



}

}
