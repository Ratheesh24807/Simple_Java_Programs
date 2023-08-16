package in.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithSet {
	
	public static void main(String[] args) {

		List<Integer> duplicate = new ArrayList<>();
		duplicate.add(10);
		duplicate.add(10);
		duplicate.add(30);
		System.out.println(duplicate.stream().collect(Collectors.toSet()));
		
		
	}
		
}
