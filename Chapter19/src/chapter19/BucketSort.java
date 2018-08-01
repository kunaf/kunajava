/*
(Bucket Sort) A bucket sort begins with a one-dimensional array of positive integers to be
sorted and a two-dimensional array of integers with rows indexed from 0 to 9 and columns indexed
from 0 to n – 1, where n is the number of values to be sorted. Each row of the two-dimensional array
is referred to as a bucket. Write a class named BucketSort containing a method called sort that op-
erates as follows:
a) Place each value of the one-dimensional array into a row of the bucket array, based on
the value’s “ones” (rightmost) digit. For example, 97 is placed in row 7, 3 is placed in
row 3 and 100 is placed in row 0. This procedure is called a distribution pass.
b) Loop through the bucket array row by row, and copy the values back to the original ar-
ray. This procedure is called a gathering pass. The new order of the preceding values in
the one-dimensional array is 100, 3 and 97.
c) Repeat this process for each subsequent digit position (tens, hundreds, thousands, etc.).
On the second (tens digit) pass, 100 is placed in row 0, 3 is placed in row 0 (because 3
has no tens digit) and 97 is placed in row 9. After the gathering pass, the order of the
values in the one-dimensional array is 100, 3 and 97. On the third (hundreds digit)
pass, 100 is placed in row 1, 3 is placed in row 0 and 97 is placed in row 0 (after the 3).
After this last gathering pass, the original array is in sorted order.
The two-dimensional array of buckets is 10 times the length of the integer array
being sorted. This sorting technique provides better performance than a bubble sort,
but requires much more memory—the bubble sort requires space for only one addi-
tional element of data. This comparison is an example of the space/time trade-off: The
bucket sort uses more memory than the bubble sort, but performs better. This version
of the bucket sort requires copying all the data back to the original array on each pass.
Another possibility is to create a second two-dimensional bucket array and repeatedly
swap the data between the two bucket arrays.
 */
package chapter19;

/**@author kuna */

import java.util.Arrays;
import java.security.SecureRandom;

public class BucketSort {

    public static void main(String[] args) {
        
         SecureRandom generator = new SecureRandom();
        
        int[] data = new int[10]; // create array
        
        for (int i = 0; i < data.length; i++) // populate array
            data[i] = 10 + generator.nextInt(90);
    
        System.out.printf("Unsorted array:%n%s%n%n",
        Arrays.toString(data)); // display array
       
        bucketSort(data); // sort array
        for(int i = 0; i < data.length; i++)
            System.out.printf("%d ", data[i]);
        System.out.println();
        System.out.println();   
    }
    
    //bucket sort algorithm
    public static void bucketSort(int[] data) {
        int temp = 0; //variable stores the tenth, hundreth, thousanth... figures
        int div = 10; //variable stores the value used to alculate tenths etc
        int arrayVal = 0;
        /*loops through the one dimensional array, where to place the place the value in the
        two dimensional array*/
        for(int index = 0; index < data.length; index++) {
            temp = data[index] % div;
            arrayVal = data[index];
            insertTable(temp, data, arrayVal);
        }
        
        for(int value: data) 
            System.out.print(value + "");
    }
    
    //insert values into two dimensional array
    private static void insertTable(int temp, int[] data, int arrayVal) {
        int[][] twoDi = new int[10][data.length - 1]; //creation of two D array
        
        for(int j = 0; j < data.length;j++) {
            if((twoDi[temp][j]) != 0)
               twoDi[temp][j+1] = arrayVal;
            else
               twoDi[temp][j] = arrayVal;
        }
    }

    //read sorted values from 2D array
    public static void printArray() {
        
    }
}
