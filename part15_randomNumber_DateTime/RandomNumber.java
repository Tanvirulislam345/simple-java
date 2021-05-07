
package BasicJava;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    
    public static void main(String[] args) {
        
             
   /*   We can find random number using three way
        1.Using the Math Class with random() Method
        2.Using the Random Class
        3.Using the ThreadLocalRandom Class
    */
   

//       // 1.Using the Math Class with random() Method 
//        int randNumber = (int) (Math.random()*10);// *10 means total 10 number lowest 0 height 9.
//        System.out.println("random number = "+randNumber);
         
        //        2.Using the Random Class
        Random rand = new Random();

        //declare a random number and limit
        //int randNumber = rand.nextInt(10) + 1;//1 means start point 0+1 = 1
        int randNumber = rand.nextInt(10);//0 to 9 prjnto hbe
        System.out.println("random number = " + randNumber);
        
////        3.Using the ThreadLocalRandom Class
//        int a = ThreadLocalRandom.current().nextInt(10)+10;
//        System.out.println("the random number is :"+a);

    }
    
}
