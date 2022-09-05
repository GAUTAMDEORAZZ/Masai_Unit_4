package problem2;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> Fruits=new ArrayList<>();
		Fruits.add("Mango");
		Fruits.add("Banana");
		Fruits.add("Apple");
		Fruits.add("Pinapple");
		Fruits.add("Grapes");
		Fruits.add("Orange");
		System.out.println("--------for Loop------");
		
		
		for (int i = 0; i < Fruits.size(); i++) {
			System.out.println(Fruits.get(i));
			
		}
		System.out.println("------Enhanced for loop-------");
		
		for (String string : Fruits) {
			System.out.println(string);
		}
		System.out.println("---------Iterator-------");
		
		Iterator<String>  it= Fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
