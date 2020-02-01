package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value:");
		int value = input.nextInt();
		
		if(value < 10) {
			System.out.println("Yes it is true");
		}
		else if(value < 20) {
			System.out.println("No it is not posible");
		}
		else {
			System.out.println("false");
		}

	}

}
