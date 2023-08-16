package in.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSorting {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(102);
		numbers.add(205);
		numbers.add(205);
		numbers.add(12);
		
		numbers.sort((r1,r2) -> r1.compareTo(r2));
		
		// numbers.forEach((a)-> System.out.println(a));
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		
	}

}
