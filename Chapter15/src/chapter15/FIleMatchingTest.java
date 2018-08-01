/*
 *Write a program to create data for testing the program. Use the sample account data in
Figs. 15.14 and 15.15. Run the program to create the files trans.txt and oldmast.txt
to be used by your file-matching program.
 */
package chapter15;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FIleMatchingTest {
    
    private static Formatter output; //outputs text to file
    
    public static void main(String[] args) {
        
        openFile();
        addRecords();
        closeFile();
    }
    Scanner input = new Scanner(System.in);
    static int choice;
    
    //open file trans.txt or oldmast.txt
    public static void openFile() {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Select the file you want to open and enter the option number:");
            System.out.println("1. oldmast.txt");
            System.out.println("2. trans.txt");
            choice = input.nextInt();
            
            if(choice == 1) {
                output = new Formatter("oldmast.txt"); //open oldmast.txt file
            }
            
            else if(choice == 2) {
                output = new Formatter("trans.txt"); //open trans.txt file
            }
        }
        catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating..");
            System.exit(1); //terminate the program
            
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating..");
            System.exit(1); //terminate program
        }
    }
    
    //add records to file
    public static void addRecords() {
        if(choice == 1) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");
            
            while(input.hasNext()) { //loop untill end of file indicator
                try {
                    //output new record to filr assume valid input
                    output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), 
                            input.nextInt(), input.nextDouble());
                }
                catch( FormatterClosedException formatterClosedException) {
                    System.err.println("Error writing to file. Terminating. ");
                    break;
                }
                catch(NoSuchElementException noSuchElementException) {
                    System.err.println("Invalid input, please try again. ");
                    input.nextLine(); //discard input so user can try again
                }
                System.out.println("? ");
            }//end while

        }
        else if(choice == 2) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number and amount.",
                    "Enter end-of-file indicator to end input.");
            
            while(input.hasNext()) { //loop untill end of file indicator
                try {
                    //output new record to filr assume valid input
                    output.format("%d %.2f%n", input.nextInt(), input.nextDouble());
                }
                catch( FormatterClosedException formatterClosedException) {
                    System.err.println("Error writing to file. Terminating. ");
                    break;
                }
                catch(NoSuchElementException noSuchElementException) {
                    System.err.println("Invalid input, please try again. ");
                    input.nextLine(); //discard input so user can try again
                }
                System.out.println("? ");
            }//end while
        }
    } //end method addRecords
    
    public static void closeFile() {
        if(output != null)
            output.close();
    }//end method closeFile
}//end class file matching test
