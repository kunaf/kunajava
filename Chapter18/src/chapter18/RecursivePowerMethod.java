/*
 (Recursive Power Method) Write a recursive method that, when called, returns
power(base, exponent)
For example, power (3,4) = 3 * 3 * 3 * 3. Assume that exponent is an integer greater than or equal
to 1. Hint: The recursion step should use the relationship
base ^(exponent) = base · base^(exponent – 1)
and the terminating condition occurs when exponent is equal to 1 , because
base(1) = base
Incorporate this method into a program that enables the user to enter the base and exponent .
 */
package chapter18;

/** @author kuna*/
import java.util.Scanner;

public class RecursivePowerMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base and exponent: ");
        int base = input.nextInt();
        int exponent = input.nextInt();
        
        long result = power(base, exponent);
        
        System.out.printf("The result is: %d%n", result);
    }
    
    public static long power(int base, int exponent) {
        if(exponent == 1)
            return base;
        else 
            return base * power(base, exponent-1);
    }
}
