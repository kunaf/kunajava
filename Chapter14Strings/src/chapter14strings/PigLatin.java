/*
 * (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split . To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputer-
cay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatin-
Word to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
all the converted sentences in a text area.
 */
package chapter14strings;
import java.util.Scanner;

import java.util.StringTokenizer;
/**
 *
 * @author kuna
 */
public class PigLatin {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                
        //user enters the senntence
        System.out.println("Enter the sentence: ");
        String sentence = input.nextLine();
        
        //split the sentence into tokens
        String[] tokens = sentence.split(" ");
        
        //print tokens
        for(int token = 0; token < tokens.length; token++){
            //get a token(word in the sentence) and store in variable tok
        String tok = tokens[token];
        //store first character in variable bufffer and replace first character with whitespace
        char buffer = tok.charAt(0);
        StringBuilder change = new StringBuilder(tok);
        change.deleteCharAt(0);
        
        //append first character to the end of the word
        change.append(buffer);
        //append ay to the end of the word
        change.append("ay");
        System.out.print(change);
        System.out.print(" ");
        }
            
            
    System.out.println();
        
        
    }
    
}
