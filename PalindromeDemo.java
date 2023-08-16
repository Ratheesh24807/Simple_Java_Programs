package in.Java8Features;

import java.util.Scanner;

public class PalindromeDemo {
	
	public static  void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String Value : ");
		
		String s = sc.nextLine();
		
		if (isPalindrome(s)) {
			System.out.println(s + " is a Palindrome ");
			
		}else {
			System.out.println(s+ " is not a palindrome");
			
		}
	}
	
	public static boolean isPalindrome(String s) {
		
		int left =0;
		int right = s.length()-1;
		
		
		while(left<right) {
			
			if(s.charAt(left) != s.charAt(right)) {
				return false;
				
			}
			left++;
			right--;
		}
		return true;
	}

}
