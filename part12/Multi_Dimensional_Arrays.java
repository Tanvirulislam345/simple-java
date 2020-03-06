package part12;

public class Multi_Dimensional_Arrays {
//Multidimensional Array String
		public static void main(String[] args) {
			
			//declare array how many rows & column do you want
			String[][] values = new String[2][3];
			
			//assign value in array index
			values[0][2] = "tanvir"+"natasha";
			values[1][2] = "tanvir";
			
			//print value
			System.out.println(values[1][2] + "\n");
			System.out.println(values[0][2] + "\n");
			
			//declare & assign String array values
			String[][] values1 = {
					{"tanu", "sanu", "kalu"},
					{"jinu", "kinu", "monu"},
					{"roni", "soni"},
			};
			
			/*
			System.out.println(values1[0][1]);
			System.out.println(values1[2][1] + "\n");
			*/
			
			System.out.println("Displaying all string type array:");
			
			//using loop for output
			for(int row = 0; row < values1.length; row++) {
				for(int col = 0; col <values1[row].length; col++) {
					System.out.print(values1[row][col] + "\t");
				}
				System.out.println("\n");
			}

		}

	}