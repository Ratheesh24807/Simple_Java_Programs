package in.mixedtypeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMathod {
	
	public static void main(String [] args) {
		
		
		List<String> duplicates = new ArrayList<>();
		
		duplicates.add("Raju");
		duplicates.add("Raju");
		duplicates.add("Ravi");
		System.out.println(duplicates.stream().distinct().collect(Collectors.toList()));
		
	}

}
