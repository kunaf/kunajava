/*
 (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
of each letter rather than of each word. For example, the string "HELLO THERE" contains two H s, three
E s, two L s, one O , one T and one R . Display the results.
 */
package chapter16;

/** @author kuna */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class CountingLetters {


    public static void main(String[] args) {
        //create hashmap to store character keys and integer values
        Map<String, Integer> myMap = new HashMap<>();
        
        createMap(myMap); //create map based on user input
        displayMap(myMap); //display mapp content
        
    }
    //create map based on user input
    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in); //create scanner
        System.out.println("Enter a string: "); //prompt for user input
        String wordString = input.nextLine();
        
        //tokenize the input
        String[] tokens = wordString.split("");
        
        //processing input text
        for(String token : tokens) {
            String letterLower = token.toLowerCase(); //get lower case letters
            //System.out.println(letterLower);
            
            //if map contains letter
            if(map.containsKey(letterLower)) { //is letter in map?
                int count = map.get(letterLower); //get current count
                map.put(letterLower, count + 1); //increment count
            }
            else
                map.put(letterLower, 1); //add new word with a count of 1 to map
        }
    }
    
    //display map content
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); //get keys
        
        //sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        
        System.out.printf("%nMap contains: %nLetter\t\tValue%n");
        
        //generate output for each key in map
        for(String key: sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));
       
    }
    
}
