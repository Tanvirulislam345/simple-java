package simpleJava;

public class Part12MultidimensionalArray {
//Multidimensional array in java
	public static void main(String[] args) {
		
		int[][] values = {
				{3, 4, 5},
				{6, 8},
				{9, 10, 11}
		};
		
	
		for(int row = 0; row < values.length; row++) {
			for(int col = 0; col < values[row].length; col++)
			{
				System.out.print(values[row][col] + "\t");
			}
			System.out.print("\n");
			
		}
	
	/*
	 	System.out.println("\n");
		System.out.println(values[0][0]);
		System.out.println(values[0][1]);
		System.out.println(values[0][2]);
		
		System.out.println(values[1][0]);
		System.out.println(values[1][1]);
		
	
		
		System.out.println(values[2][0]);
		System.out.println(values[2][1]);
		System.out.println(values[2][2]);
		
		**/
	}

}
