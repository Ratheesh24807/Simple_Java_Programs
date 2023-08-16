package in.Java8Features;

import java.util.function.Predicate;

public class Check {
	
	public static void main(String[] args){
		
		String[] names = {"Sudeep","Ganesh","Dharshan","Girish","Guru"};
		
		Predicate<String> r = name -> name.charAt(0) == 'G';
		for(String name : names) {
			if(r.test(name)) {
				System.out.println(name);
			}
		}
		
		for (String name: names) {
			
			if (name.startsWith("S")) {
				System.out.println(name);
			}
		}
		
	}
	

}
