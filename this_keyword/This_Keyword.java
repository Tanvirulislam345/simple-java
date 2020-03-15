
package this_keyword;

//define a class
class Person{
    
    //define instance variable
    String name;
    int age;
    double value;
    
   // define constructor
    Person(String name, int age){
        //calling Instance variable using this keyword
        this.name = name;
        this.age = age;
    }
    
    //define another constructor
    Person(String name, int age, double value){
        this(name, age);//calling constructor using this keyword
        this.value = value;
    }
    
    //define a methods
    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("Value : "+value);
    }
}
public class This_Keyword {
    public static void main(String[] args) {
        
        //create an object with passing value 
        Person p1 = new Person("tanvir", 23);
        p1.display();//calling methods
        Person p2 = new Person("tanu", 34, 45.6);
        p2.display();
    }
    
}
