package in.mixedtypeProblems;

public class AllVariables {

	public static int a = 10;  //Static variable
	int b = 20;                //Instance variable
	
	public static void main(String[] args) {
		
		int c = 30;
		
 // Accessing Static variable		
		System.out.println(AllVariables.a);
		//Accessing Local Variable
		System.out.println(c);
		
		//Accessing instance variable
		AllVariables  iv = new AllVariables();
		System.out.println(iv.b);
		
	}
	
	

}
