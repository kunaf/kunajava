/*Duplicate Elimination) Write a program that reads in a series of first names and eliminates
duplicates by storing them in a Set . Allow the user to search for a first name.
 */
package chapter16;
/*@author kuna*/
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;

public class DuplicateElimination {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //create scanner object
        
        //create set object to store first names
        String[] fNames = {};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fNames));
        
        //create and allow user to enter first names
        System.out.println("How many names are you entering? ");
        int numberNames = input.nextInt();
        
        System.out.println("Enter first names: "); //prompt user for input
        for(int i = 0; i<=numberNames; i++){ 
            String firstName = input.nextLine();
            list.add(firstName);
        }
        
       
        //print list without duplicate first names
        printNonDuplicates(list);
        
        //prompt user to enter search item 
        System.out.println("Enter search item: "); //prompt user for input
        String searchName = input.nextLine();
        
        //print search results
        printSearchResults(list, searchName);
    }
    
    // create a Set from a Collection to eliminate duplicates
    private static void printNonDuplicates( Collection<String> values ) {
        // create a HashSet
        Set<String> set = new TreeSet<>(values);
        System.out.printf("%nList of First Names: ");
        for (String value : set) 
            System.out.printf("%s ", value);
            
        System.out.println();
    }
    
    //perform binary search for a first name and display result
    private static void printSearchResults(List<String> list, String key) {
        int result = 0;
        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);
        if (result >= 0)
            System.out.printf("Found at index %d%n", result);
        else
            System.out.printf("Not Found (%d)%n",result);
    }
    
}

//list of items without duplicates
 /*for(String lists : list) {
            System.out.print(lists + " ");
        } */
        