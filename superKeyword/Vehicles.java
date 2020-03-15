package superKeyword;

public class Vehicles {
          
    //declare Instance variable
    String name;
     double spreed;
    
    //define constructor
    Vehicles(String n, double m){
        name = n;
        spreed = m;
    }
    
    //define a method
    void result(){
        System.out.println("Name : "+name);
        System.out.println("Spreed : "+spreed);
    }
}

