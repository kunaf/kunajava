/*
 *(Creating Three-Letter String s from a Five-Letter Word) Write an application that reads a
five-letter word from the user and produces every possible three-letter string that can be derived
from the letters of that word. For example, the three-letter words produced from the word “bathe”
include “ate,” “bat,” “bet,” “tab,” “hat,” “the” and “tea.”
 */
package chapter14strings;
import java.util.Scanner;
/**
 * @author kuna
 */
public class CreateString {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a five letter word: ");
        String word_five = input.nextLine();
        
        String[] val_words = {"ate", "bat", "bet", "tab", "hat", "the", "tea"};
        
        for(int i = 0; i< word_five.length(); i++) {
            for(int j = 0; j<word_five.length(); i++) {
                for(int k = 0; k< word_five.length(); k++) {
                    
                }
            }
        }
        
        
    }
    
}
