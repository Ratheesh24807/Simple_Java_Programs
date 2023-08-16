package in.Java8Features;

import java.util.function.Predicate;

public class Names {

	public static void main(String[] args) {
		
		
		String[] names = {"Anushka", "Ankitha","Anjali","Sunitha","Kavitha"};
		
		
		Predicate<String> n = name -> name.charAt(0)!='A';
		
	
		for(String name : names) {
			if(n.test(name)) {
				System.out.println(name);
			}
		}
	}
	
}
