package conditionalStatement;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		System.out.println("Enter your mark:");
		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		if(mark >= 80 && mark <= 100)
			System.out.println("A+");
		else if(mark >= 70 && mark <80)
			System.out.println("A");
		else if(mark >= 65 && mark < 70)
			System.out.println("A-");
		else if(mark >= 60 && mark < 65)
			System.out.println("B");
		else if(mark >= 50 && mark < 60)
			System.out.println("c");
		else if(mark >= 33 && mark < 50)
			System.out.println("D");
		else if(mark < 33 && mark > 0)
			System.out.println("You are not success in this exam");
		else
			System.out.println("Defult mark");
		
		
	}

}
