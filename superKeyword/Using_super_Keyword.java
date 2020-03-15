package superKeyword;

//define a class(this is super class)
class Vehicle{
    
    //declare Instance variable
    String name;
     double spreed;
    
    //define constructor
    Vehicle(String n, double m){
        name = n;
        spreed = m;
    }
    
    //define a method
    void result(){
        System.out.println("Name : "+name);
        System.out.println("Spreed : "+spreed);
    }
}

class Car extends Vehicle{
    
     //declare Instance variable
    int gear;
    
     //define constructor
    Car(String n, double m, int k){
        super(n, m);//calling constructor using super
        gear = k;
    }
    
    //define a method
    @Override
    void result(){
        
        super.result();//calling method using super
        System.out.println("Gear : "+gear);
    }
}
public class Using_super_Keyword {
    public static void main(String[] args) {
        
        Car Display = new Car("Tanvir", 34.5, 3);
        Display.result();
    }
}
