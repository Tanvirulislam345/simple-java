package conditionalStatement;

import java.util.Scanner;

public class Leapyear3If {
	//leap year.

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.println("All leap year list is:");
		for(int number = 0; number <= value; number++)
		if(number % 4 == 0 && number % 100 != 0 || number % 400 == 0 )
		{

			System.out.print(number+" ");
		}
	}

}
