/*
(Greatest Common Divisor) The greatest common divisor of integers x and y is the largest
integer that evenly divides into both x and y . Write a recursive method gcd that returns the greatest
common divisor of x and y . The gcd of x and y is defined recursively as follows: If y is equal to 0 ,
then gcd(x, y ) is x ; otherwise, gcd(x, y ) is gcd(y, x % y ), where % is the remainder operator. Use
this method to replace the one you wrote in the application of Exercise 6.27.
 */
package chapter18;

/**@author kuna */
import java.util.Scanner;

public class RecursionGCD {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the integers whose gcd you want to find: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        int result = gcd(x, y);
        
        System.out.printf("The result is: %d%n", result);
    }
    
    //method to calculate the gcd of two integers
    public static int gcd(int x, int y) {
        
        //base case
        if(y == 0)
            return x;
        else { //recursive step
            y = x % y;
            return gcd(x, y);
        }
              
    }
    
}
