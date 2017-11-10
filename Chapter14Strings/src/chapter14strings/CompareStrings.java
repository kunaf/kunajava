/*
 * This program uses the compareString method too compare any two strings
 */
package chapter14strings;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s1, s2;
        
        System.out.println("Enter the first string: ");
        s1 = input.next();
        System.out.println("Enter the second string: ");
        s2 = input.next();
        
        if((s1.compareTo(s2)) > (s2.compareTo(s1))) {
            System.out.printf("%s is greater than %s", s2, s1);
        }
        else
            System.out.printf("%s is greater than %s", s1, s2);
        
    }
    
}
