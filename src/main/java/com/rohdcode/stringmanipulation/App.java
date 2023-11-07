package com.rohdcode.stringmanipulation;

import java.util.ArrayList;

import com.rohdcode.stringmanipulation.inheritage.Animal;
import com.rohdcode.stringmanipulation.inheritage.Cat;
import com.rohdcode.stringmanipulation.interfaces.Printable;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*String line = "2 automations with neural engine";

		for (String word : line.split(" ")) {
			System.out.println("Word : " + word);
		}
		
		System.out.println("--------------------------------");
		
		int limite = 2;
		for (String word : line.split(" ", limite)) {
			System.out.println("Word : " + word);
		}

		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < line.length(); i++) {

			System.out.println("letter : " + line.charAt(i));
		}*/
		
		/*Cat cat = new Cat();
		Animal animal = cat;
		
		System.out.println(cat.weight);*/
		
		
		
		// Arrow fonction
		
		 ArrayList<Integer> liste = new ArrayList<Integer>();
		 liste.add(1);
		 liste.add(2);
		 liste.add(3);
		 liste.add(4);
		
		 Printable printable = (p, s) -> p + " meow " + s;
		printFunction(printable);
		 
	}
	
	static public void printFunction(Printable printable) {
		System.out.println(printable.print(":-p", "!"));
	}
}
