package part6;

import java.util.Scanner;

public class Do_while_Loop {
//Do while loop program
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		/*
		 * //Using While loop
		 * System.out.println("Enter the number:"); 
		 * int value = input.nextInt();
		 * 
		 * while (value != 5) {
		 *  System.out.println("Enter the number:");
		 *   value =input.nextInt(); 
		 *   }
		 */

		int value;
		//using do While loop
		do {
			System.out.println("Enter the number:");
			value = input.nextInt();
		} while (value != 5);
		System.out.println("yes I got it");

	}

}
