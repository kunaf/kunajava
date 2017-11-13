/*
 * 14.11 (Searching String s) Write an application that inputs a line of text and a search character and
uses String method indexOf to determine the number of occurrences of the character in the text.
 */
package chapter14strings;
import java.util.Scanner;
/**
 * @author kuna
 */
public class SearchString1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        
        System.out.println("Enter search character: ");
        String c = input.next();
        
        //declaration adn definition of var i and count
        int count = 0;
        int i = sentence.indexOf(c);
       //loop counts the occurences of c beggining after the seen occurence
        while(i>0) {
           count += 1;
           i = sentence.indexOf(c, i+1);
            
        }
        //print the number of times character occurs in sentence        
        System.out.println(count);
                
    }
    
}
