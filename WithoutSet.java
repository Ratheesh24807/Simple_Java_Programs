package in.mixedtypeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutSet {
	
	public static void main(String[] args) {
		
		List<String> RG = new ArrayList<>();
		RG.add("Ratheesh");
		RG.add("Rakesh");
		RG.add("Ratheesh");
		RG.add("Brothers");
		System.out.println(RG.stream().distinct().collect(Collectors.toList()));

}
}