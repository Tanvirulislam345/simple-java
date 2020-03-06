package part8;

import java.util.Scanner;

public class If_LeapYear {
// leap year.
	public static void main(String[] args) {

		System.out.println("Enter the value:");
		
		//Declare Scanner for taking value bye user
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();//taking integer value by user
		
		System.out.println("All leap year list is:");
	
		int sum = 0;
		for (int number = 1; number <= value; number++)	//using for loop
			//using if condition with some bitwise operator
			if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {

				System.out.print(number + " ");
				sum = sum + 1;
			}
		System.out.println("\n");
		System.out.println("Total leap year is :"+ sum);
	}

}