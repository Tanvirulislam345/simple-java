package lab2222;

public class Circle {

	//instance variable
	double r;
	double pi = 3.1416;
	
	//constructor is a method ,it has not data type , 
	//class ar nam tai constructor ar nam hbe
    // parameter pass kra constructor ar kaj
	
	Circle (double x) {
		r = x ;
	}
	
	//create methods
	public double Cir_area() {
		
		return pi*r*r;
	}
}
