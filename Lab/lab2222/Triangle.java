package lab2222;

public class Triangle {
	//instance variable
	int length, width;
	
	//create setter.
	public void setter(int x, int y) {
		
		length = x;
		width = y;
		
	}
	//create methods
	public double tri_area() {
		
		double c = 0.5*length*width;
		return c;
		
	}
	

}
