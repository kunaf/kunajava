/*
 * (Comparing Portions of String s) Write an application that uses String method region-
Matches to compare two strings input by the user. The application should input the number of char-
acters to be compared and the starting index of the comparison. The application should state
whether the strings are equal. Ignore the case of the characters when performing the comparison.
 */
package chapter14strings;
 import java.util.Scanner;
/**
 * @author kuna
 */
public class ComparePortions {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s1, s2;
        int charac1, start1, charac2, start2;
        
        System.out.println("Enter the first String: ");
        s1 = input.next();
        System.out.println("Enter the number of characters to be compared and starting index for comparison: ");
        charac1 = input.nextInt();
        start1 = input.nextInt(); 
        
        System.out.println("Enter the seond String: ");
        s2 = input.next();
        System.out.println("Enter the number of characters to be compared and starting index for comparison: ");
        charac2 = input.nextInt();
        start2 = input.nextInt(); 
        
        if(s1.regionMatches(true, start1, s2, start2, charac2))
            System.out.println("Strings compared are equal!");
        else
            System.out.println("Strings compared are not equal!");
        
        
    }
    
}
