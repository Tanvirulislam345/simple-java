package conditionalStatement;

import java.util.Scanner;

public class Example67page97 {
//sum all integer value grater than 100 to less than 200.
	public static void main(String[] args) {

		System.out.println("Enter the value of n:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int sum = 0;
		
		if (n > 100 && n < 200) {
			System.out.println("Displaying all sum :");
			for (int i = n; i < 200; i++) {
				sum = sum + i;
				System.out.println(sum);

			}
			System.out.println("\n");
			System.out.println("sum of all integer value is = " + sum);
		} else
			System.out.println("default");
	}

}
