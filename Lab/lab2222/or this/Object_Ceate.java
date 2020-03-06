package lab2222;

//Declare class
		class Addition {

			//declare Instance variable
			int a = 12, b = 15;

			//create methods
			void add() {

				int c = a + b;
				System.out.println(c);
				//System.out.println(a+b);
			}
		}

		class Subtraction {

			int a = 12, b = 15;

			void sub() {

				// int c = a - b;
				System.out.println(a - b);
				
			}
		}

		class Multiplication {

			int a = 12, b = 15;

			void mul() {

				// int c = a * b;
				System.out.println(a * b);
			}
		}

		class Division {

			int a = 12, b = 15;

			void divis() {
				
				// int c = a / b;
				System.out.println(a / b);
			}
		}

		class Modulo {

			int a = 12, b = 15;

			void mod() {

				int c = a % b;
				System.out.println(a % b);
			}
		}


public class Object_Ceate {

	public static void main(String[] args) {

				// creating object
				Addition add1 = new Addition();
				Subtraction sub1 = new Subtraction();
				Multiplication mul1 = new Multiplication();
				Division divis1 = new Division();
				Modulo mod1 = new Modulo();

				System.out.println("The Addition is:");
				add1.add();//Passing value
				System.out.println("The subtraction is:");
				sub1.sub();
				System.out.println("the Multiplication  is:");
				mul1.mul();
				System.out.println("The Division is:");
				divis1.divis();
				System.out.println("The modulo Division  is:");
				mod1.mod();

			}

		}

