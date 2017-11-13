/*
 * (Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
string in the form (555) 555-5555 . The application should use String method split to extract the
area code as a token, the first three digits of the phone number as a token and the last four digits of
the phone number as a token. The seven digits of the phone number should be concatenated into
one string. Both the area code and the phone number should be printed. Remember that you’ll have
to change delimiter characters during the tokenization process.
 */
package chapter14strings;
import java.util.Scanner;
/**
 * @author kuna
 */
public class Tokenizing {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        //Enter telephone number
        System.out.println("Enter the telephone number: ");
        String telephone = input.nextLine();
        
        //split phone number into tokens
        String[] tokens = telephone.split(" |-|\\)\\s*|\\(\\s*"); //separated by spaces
        
        String phonenumber = tokens[2] + tokens[3];
       
        System.out.printf("Area Code: %s\n", tokens[1]);
        System.out.printf("Phone Number: %s\n\n", phonenumber);
    }
    
} 