/*
 * (Displaying String s in Uppercase and Lowercase) Write an application that inputs a line of
text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
 */
package chapter14strings;
import java.util.Scanner;
/**
 * @author kuna
 */
public class UpperLowerCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sentence: ");
        String sentence = input.nextLine();
        
        //convert string to lower case and print
        String lower = sentence.toLowerCase();
        
        System.out.println("\nSentence in upper case: ");
        System.out.println(lower);
        
        //coonvert string to upper case and print
        String upper = sentence.toUpperCase();
        
        System.out.println("\nSentence in lower case: ");
        System.out.println(upper);
    }
    
}
