package in.mixedtypeProblems;

public class Forward {

	public static void main(String[] args) {
		
		String str = "Raju";
		
		System.out.println("----Forwardward-----");
		for(int i = 0; i<str.length();i++) {
			
			System.out.println(str.charAt(i));
			System.out.println(str.length());
			
		}
		System.out.println("----Backward-----");
		for (int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
			
		}
	}
	
}
