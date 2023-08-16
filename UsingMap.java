package in.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {

	
	public static void main(String[] args ) {
		
		List<String> Laptops = new ArrayList<>();
		
	
		Laptops.add("Nova");
		Laptops.add("Lanova");
		Laptops.add("Apple");
		Laptops.add("HP");
		Laptops.add("Dell");
		
		List<List<String>> lists = new ArrayList<>();
		
		lists.add(Laptops);
		
		System.out.println(Laptops.stream().map(a>a).collect(Collectors.toList()));

		
	
}
