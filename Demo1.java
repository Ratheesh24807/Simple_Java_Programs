package in.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	
	public static void main(String [] args) {
		
		List<String> names = new ArrayList<>();
		
		
		names.add("Rakesh");
		names.add("Soma");
		names.add("Rakesh");
		names.add("Thamesh");
		names.remove(3);
		
		names.sort((p1,p2)-> p2.compareTo(p1));
		System.out.println(names.stream().collect(Collectors.toSet()));
	
		
	}
}
