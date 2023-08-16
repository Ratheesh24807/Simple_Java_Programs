package in.Java8Features;

public class PalindromeD {
	
	public static void main(String[] args ) {
		
		String s = "Radar";
		
		if (isPalindrome(s)) {
			
			System.out.println(s + " is a Palindrome");
			
		}else {
			System.out.println(s + " is not a Palindrome");
		}
		
	}

	public static boolean isPalindrome(String s) {
		String ps = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int length = ps.length();
		for (int i=0; i<length/2;i++) {
			if(ps.charAt(i) != ps.charAt(length- i-1)) {
				return false;
			}
		}
				
		return true;
	}
}
