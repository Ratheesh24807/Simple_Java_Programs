package in.Java8Features;

import java.util.function.Predicate;

public class LamdaExp {

	public static void main(String[] args) {
	
   Predicate<Integer> g =	i-> i>10;
   
   System.out.println(g.test(15));
	
	}

}