/*
 *(Searching String s) Write an application based on the application in Exercise 14.11 that
inputs a line of text and uses String method indexOf to determine the total number of occurrences
of each letter of the alphabet in the text. Uppercase and lowercase letters should be counted together.
Store the totals for each letter in an array, and print the values in tabular format after the totals have
been determined.
 */
package chapter14strings;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author kuna
 */
public class SearchString2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> charac = new ArrayList<Character>();
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
                    
       // char[] charac = {};

        System.out.println("Character\t\t\t\t\tCount");
        
        for(int i = 0; i < sentence.length(); i++) {
            int count = 0;
            char c = sentence.charAt(i);
            if(charac.contains(c) == false) {
                 charac.add(c);
                 // System.out.println(charac.length);
                int index = sentence.indexOf(c);
                if( i == 0 && index == 0) {
                    //count +=1;
                    //loop counts the occurences of c beggining after the seen occurence
                    while(index>=0) {
                        count += 1;
                        index = sentence.indexOf(c, index+1);
                    }
                }
                else {
                    //loop counts the occurences of c beggining after the seen occurence
                    while(index>0) {
                        count += 1;
                        index = sentence.indexOf(c, index+1);
                    }
                
                }
                
                System.out.printf("%s\t\t\t\t\t%s", c, count);
                System.out.println(""); 
            }  
            else
                count = 0;
 
        }
    }
    
}
