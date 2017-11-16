/*
 * 
Tokenizing and Comparing String s) Write an application that reads a line of text, token-
izes it using space characters as delimiters and outputs only those words ending with the letters " ED ".
 */
package chapter14strings;

import java.util.Scanner;

/**
 * @author kuna
 */
public class TokenizeCompare2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] tokens = sentence.split(" ");
        
        String word;
        
        System.out.println("\nWords ending with ed\n");
        for(int i = 0; i < tokens.length; i++) {
            word = tokens[i];
            
            int j = word.length()-2;
            int k = word.length()-1;
            
            if((word.charAt(j) == 'e') && (word.charAt(k) == 'd'))
                System.out.println(word);
            
        }
                
        System.out.println(" ");
    }
    
}
