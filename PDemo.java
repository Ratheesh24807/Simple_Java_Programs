package in.Java8Features;

public class PDemo {

	public static void main(String[] args) {
		
		String s = "madam";
		
		if(isPalindrome(s)) {
			System.out.println(s + " Is a Palindrome");
			
		}else {
			System.out.println(s + " is not a Palindrome");
			
		}
		
	}

	public static boolean isPalindrome(String s) {
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
		
		left++;
		right--;
		
	}

	return true;
}}
