package in.Java8Features;

import java.util.function.Predicate;

public class Demo {

	public static void main(String [] args) {
		
		
		String[] names = {"Ratheesh","Rakshith","Kiran","Surya"};
		
		Predicate<String> p = name  -> name.charAt(0) == 'R';
	
		for (String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
			
		}
	
	}
	
	
}
