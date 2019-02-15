/*
(Generic isEqualTo Method) Write a simple generic version of method isEqualTo that
compares its two arguments with the equals method and returns true if they’re equal and false
otherwise. Use this generic method in a program that calls isEqualTo with a variety of built-in types,
such as Object or Integer . What result do you get when you attempt to run this program?
 */
package chapter20;

/** @author kuna */

public class GenericIsEqual {

    public static void main(String[] args) {
        isEqualTo(7, 7);
        
        Integer first = 10;
        Integer second = 11;
        Double firstD = 12.24;
        Double secondD = 12.36;
        String firstS = "Kunis";
        String secondS = "Kunis";
        
        System.out.printf("Compare %d with %d%n", first, second);
        System.out.print(isEqualTo(first, second));
        System.out.printf("%nCompare %.2f with %.2f%n", firstD, secondD);
        System.out.print(isEqualTo(firstD, secondD));
        System.out.printf("%nCompare %s with %s%n", firstS, secondS);
        System.out.println(isEqualTo(firstS, secondS));
        
    }
    
    public static <T extends Comparable<T>> boolean isEqualTo(T first, T second) {
        
        if(first.compareTo(second) == 0)
            return true;
        else 
            return false;
    }
    
}
