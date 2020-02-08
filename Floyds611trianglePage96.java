package conditionalStatement;

import java.util.Scanner;

public class Floyds611trianglePage96 {
//Find floyd's triangle
	public static void main(String[] args) {
		  int  a = 1;

		  System.out.println("Enter the number of rows of Floyd's triangle to print:");
		  Scanner input = new Scanner(System.in);
		  int n = input.nextInt();

		  for (int i = 1; i <= n; i++)
		  {
		    for (int c = 1; c <= i; c++)
		    {
		      System.out.print(a+"  ");
		      a++;
		    }
		   System.out.print("\n");
		  }

	}

}
