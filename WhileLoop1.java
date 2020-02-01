package application;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("Enter the number:"); 
		 * int value = input.nextInt();
		 * 
		 * while (value != 5) {
		 *  System.out.println("Enter the number:");
		 *   value =input.nextInt(); }
		 */

		int value = 0;
		do {
			System.out.println("Enter the number:");
			value = input.nextInt();
		} while (value != 5);
		System.out.println("I got it, that is 5");
	}
}
