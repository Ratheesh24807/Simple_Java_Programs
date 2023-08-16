 package in.mixedtypeProblems;

@FunctionalInterface
interface Demo2 {

	public void m1();

}

public class Demo1 implements Demo2{

	public void m1() {
		System.out.println("M1 method is called");
		
		

	}

	public static void main(String[] args) {
		
		Demo1 c = new Demo1();
		c.m1();
	}
}
