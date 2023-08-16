package in.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class Training {

	
	public static void main(String[] args) {
	
		
		List<String> Laptop = new ArrayList();
		
		Laptop.add("DEll");
		Laptop.add("HP");
		Laptop.add("Apple");
		
		
		Laptop.sort((s1,p2) -> s1.compareTo(p2));
		
		Laptop.forEach(b->
			System.out.println(b)
		);
	}
}
