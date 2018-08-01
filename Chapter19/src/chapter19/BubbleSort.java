/*
 (Bubble Sort) Implement bubble sort—another simple yet inefficient sorting technique. It’s
called bubble sort or sinking sort because smaller values gradually “bubble” their way to the top of
the array (i.e., toward the first element) like air bubbles rising in water, while the larger values sink
to the bottom (end) of the array. The technique uses nested loops to make several passes through
the array. Each pass compares successive pairs of elements. If a pair is in increasing order (or the
values are equal), the bubble sort leaves the values as they are. If a pair is in decreasing order, the
bubble sort swaps their values in the array. The first pass compares the first two elements of the array
and swaps their values if necessary. It then compares the second and third elements in the array. The
end of this pass compares the last two elements in the array and swaps them if necessary. After one
pass, the largest element will be in the last index. After two passes, the largest two elements will be
in the last two indices. Explain why bubble sort is an O(n 2 ) algorithm.
 */
package chapter19;

/** @author kuna */
import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
public class BubbleSort {
    
    //bubble sort algorithm
    public static void bubbleSort(int[] data) {
        for(int index = 0; index < data.length-1; index++) {
            if(data[index] > data[index+1]) 
                swap(data, index, index+1);
            //printPass(data, index + 1, index);
        }
    }
    //method to swap array elements
    private static void swap(int[] data, int first, int second){
        int temp = data[first]; //temmporary storage location
        data[first] = data[second];
        data[second] = temp;
    }
    
    /*print passes
    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("after pass %2d: ", pass);
        // output elements till selected item
        for (int i = 0; i < index; i++)
            System.out.printf("%d ", data[i]);
        System.out.printf("%d* ", data[index]); // indicate swap
        System.out.println();
    } */
    
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        
        int[] data = new int[10]; // create array
        
        for (int i = 0; i < data.length; i++) // populate array
            data[i] = 10 + generator.nextInt(90);
    
        System.out.printf("Unsorted array:%n%s%n%n",
        Arrays.toString(data)); // display array
        
        for(int j = 0; j < 6; j++) {
            bubbleSort(data); // sort array
            for(int i = 0; i < data.length; i++)
                System.out.printf("%d ", data[i]);
            System.out.println();
            System.out.println();
        }
        
         /*System.out.printf("Sorted array(first pass):%n%s%n%n",
        Arrays.toString(data)); // display array */
         
         
    }
    
}
