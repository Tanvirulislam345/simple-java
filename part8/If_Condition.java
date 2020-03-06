package part8;

import java.util.Scanner;

public class If_Condition {
//If statement program
	public static void main(String[] args) {
	
		//Using Scanner getting input by user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int value = input.nextInt();//taking integer value by user.
		
		//using if condition
		if(value < 10) {
			System.out.println("Yes it is true");
		}
		//using else if condition
		else if(value < 20) {
			System.out.println("No it is not posible");
		}
		else {
			System.out.println("false");
		}

	}

}
