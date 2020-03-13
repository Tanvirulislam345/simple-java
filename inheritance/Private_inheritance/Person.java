package Private_inheritance;

//define a class
public class Person {
    
    //declare private variable
    private String name;
   private  int age;

 
// using getter and setter methods
    public void setName(String name) {
        this.name = name;
    }
       public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
        public int getAge() {
        return age;
    }
  
}
