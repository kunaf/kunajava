/*
 (Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts 25 ran-
dom integers from 0 to 100 in order into a LinkedList object. The program should sort the ele-
ments, then calculate the sum of the elements and the floating-point average of the elements.
 */
package chapter16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/** @author kuna */
public class InsertSortedElts {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); //create scanner object
        
        //create set object to store integers
        Integer[] numbers = {};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(numbers));
        
        //create and allow user to enter 25 integers
        int number; 
        int sum = 0;
        System.out.println("Enter 25 integers between o and 100: "); //prompt user for input
        for(int i = 0; i<25; i++){ 
            number = input.nextInt();
            while(number < 0 || number > 100) {
                System.out.println("Integer must be greater than 0 and less than 100");
                number = input.nextInt();
            }
            list.add(number);
            sum += number;
        }
        
        //sort elements in the list
        Collections.sort(list); // sort ArrayList
        System.out.printf("Sorted array elements: %s%n", list);
        
        //sum of elements
        System.out.printf("Sum of elements: %d%n", sum);
        
        double avr = sum/25;
        System.out.printf("Average of elements is: %.3f%n", avr); 
    }
        
   
    
}
