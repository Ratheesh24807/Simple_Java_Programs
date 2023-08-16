package in.Java8Features.stream;

import java.util.Scanner;

public class Branch {
	
	public static void main(String[] args) {
		
		int PIN;
		int amount_bal = 1000;
		int amount_withdrawal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the PIN number");
		int PIN1 = sc.nextInt();
		System.out.println("Enter the Amount that needs to be drawn");
		int amount_withdrawal1 = sc.nextInt();
		
		
		if(PIN1 == 1234) {
			
			if(amount_bal> amount_withdrawal1) {
				
				System.out.println("Transaction succesful");
			}
			else {
				System.out.println("Insufficient funds");
				
			}}
			else {
				System.out.println("Incorrect PIN entered");
			}
		}
		
		
		
	}


