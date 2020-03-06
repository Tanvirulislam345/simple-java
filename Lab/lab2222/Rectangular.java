package lab2222;

public class Rectangular {
	//instance variable
	int length, width;
	
	//create setter
	public void setter(int x, int y) {
		
		length = x;
		width = y;
	}
	
	public int rec_area(){
		
		return length*width;
	}

}
