package in.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsDemo{
	
	
	public static void main(String [] args) {
		
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(125);
		numbers.add(45);
		numbers.add(54);
		numbers.add(0, 33);
		numbers.add(125);
		
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		
		System.out.println(numbers.stream().collect(Collectors.toSet()));
		
		System.out.println(numbers.stream().sorted().collect(Collectors.toSet()));
		
		
		numbers.forEach(System.out::println);
		
		System.out.println(numbers);
	}
}