package lab2222;

public class Lab2 {

	public static void main(String[] args) {
		
		 //create object h
		Hello h = new Hello();
		
		h.hello_world();
		
		h.geta();
		System.out.println(h.geta());
		
		System.out.println(h.a);
		h.a = 127;
		System.out.println(h.a);
		
		double c = h.b;
		System.out.println(c);
		System.out.println(h.b);
		System.out.println("\n");
		
		
		//create rec object
		Rectangular rec = new Rectangular();
		//inputing setter
		rec.setter(12, 14);
		System.out.println("Rectangular value is:"+rec.rec_area());
		System.out.println("\n");
		
		//create an object
		Triangle tri = new Triangle();
		//inputing setter
		tri.setter(10, 15);
		System.out.println("triangle value is:"+tri.tri_area());
		System.out.println("\n");
		
		//create object with constructor
		Circle cir = new Circle(5.5);
		System.out.println("Circle area is :"+cir.Cir_area());
		

	}

}
