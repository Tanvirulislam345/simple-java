package part14;

		//create a class and using some methods.

		class man{
			/*
			*class can contain 2 thing.
			*
			 1. field (data item)
			 2. methods/subroutines(function)
			 
			*****/
			
			
			//declaring Instance variable
			
			String name;
			int age;
			
			//Declare a void type methods .
			void speaK() {
				System.out.println("My name is "+name+" And i am "+ age +" years old");
				System.out.println("I am a java coder");
			}
			
		}

public class Methods {

	public static void main(String[] args) {
				
				
				//create  Person1,2,3 object using person class
				man person1 = new man();
				man person2 = new man();
				man person3 = new man();
				
				
				//assign some value in person data type(person is object) .
				person1.name = "Tanvirul Islam";
				person1.age = 22;
				
				person2.name = "Hasibul Islam";
				person2.age = 22;
				
				person3.name = "Soniya Islam";
				person3.age = 22;
				
				
				System.out.println(person1.name);
				System.out.println(person1.age);
				person1.speaK();
				System.out.print("\n");
				System.out.println(person2.name);
				person2.speaK();
			
				

			}

		}