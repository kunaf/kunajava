/*
 * (Tokenizing and Comparing String s) Write an application that reads a line of text, token-
izes the line using space characters as delimiters and outputs only those words beginning with the
letter " b ".
 */
package chapter14strings;
import java.util.Scanner;

/**
 *
 * @author kuna
 */
public class TokenizeCompare {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] tokens = sentence.split(" ");
        
        String word;
        
        System.out.println("\nWords beginning with b\n");
        for(int i = 0; i < tokens.length; i++) {
            word = tokens[i];
            
            if(word.charAt(0) == 'b')
                System.out.println(word);
        }
                
        System.out.println(" ");
    }
    
}
