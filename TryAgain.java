package in.Java8Features;

import java.util.function.Predicate;

public class TryAgain {
	
	
	public static void main(String[] args ) {
		
		String [] names = { "Jaykajs", "Rockjsk","Krish","Brish","Raniss"};
		
		Predicate<String> check= name -> name.charAt(4)== 'h';
		
		for(String name : names ) {
			if (check.test(name)) {
				System.out.println(name);
			}
		}
	}

}
