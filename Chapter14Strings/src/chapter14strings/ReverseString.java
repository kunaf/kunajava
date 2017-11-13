/*
 * (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
characters as delimiters.
 */
package chapter14strings;
import java.util.Scanner;
/**
 * @author kuna
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] tokens = sentence.split(" ");
        
        System.out.println("Reversed String: ");
        for(int tok = tokens.length-1; tok >= 0; tok--)
            System.out.print(tokens[tok] + " ");
        
        System.out.println("");
    }
    
}
