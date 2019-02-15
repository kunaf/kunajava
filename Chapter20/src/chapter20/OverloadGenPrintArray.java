/*
(Overloaded Generic Method printArray ) Overload generic method printArray of
Fig. 20.3 so that it takes two additional integer arguments, lowSubscript and highSubscript . A call
to this method prints only the designated portion of the array. Validate lowSubscript and highSub-
script . If either is out of range, the overloaded printArray method should throw an InvalidSub-
scriptException ; otherwise, printArray should return the number of elements printed. Then
modify main to exercise both versions of printArray on arrays integerArray , doubleArray and
characterArray . Test all capabilities of both versions of printArray .
 */
package chapter20;

/** @author kuna */
public class OverloadGenPrintArray {


    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        System.out.printf("Array integerArray contains:%n");
        printArray(intArray, 2, 3); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray, 2, 3); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(charArray, 2, 4); // pass a Character array
    }
    
    //try and catch methods to identify exception
    public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript){
        // generic method printArray
        try{
            int count = 0;  
            // display array elements
            for (int i = lowSubscript; i <= highSubscript; i++) {
                System.out.printf("%s ", inputArray[i]);
                count++;
            }
            System.out.printf("number of elements: %d", count);    
            System.out.println();
        }
        
        catch(InvalidSubscriptException invalidSubscriptException) {
            System.err.println();
        }
    }

    public class InvalidSubscriptException extends RuntimeException {
        // no-argument constructor
        public InvalidSubscriptException() {
            this("subscript is out of bounds");
        }

        // one-argument constructor
        public InvalidSubscriptException(String message) {
            super(message);
        }
    } // end class EmptyStackException
    
} // end class GenericMethodTest

