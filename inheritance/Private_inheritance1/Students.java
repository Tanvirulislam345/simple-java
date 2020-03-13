
package Private_inheritance;

public class Students extends Teacher {
    
    //declare private variable
   private int roll;

    //define set & get methods
    public void setRoll(int roll) {
        this.roll = roll;
    }
    
       public int getRoll() {
        return roll;
    }
    
       //define a methods
        void display() {

        System.out.println("Name : " +getName());
        System.out.println("Age : " +getAge());
        System.out.println("Study : " +getQuali());
        System.out.println("Roll : " +getRoll());
    }

    
}
