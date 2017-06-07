/*
Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse , toString , add and subtract . Meth-
od parse should receive a String , extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the fol-
lowing methods: isEqualTo , isNotEqualTo , isGreaterThan , isLessThan , isGreaterThanOrEqualTo
and isLessThanOrEqualTo . Each of these is a predicate method that returns true if the relationship
holds between the two HugeInteger objects and returns false if the relationship does not hold. Pro-
vide a predicate method isZero . If you feel ambitious, also provide methods multiply , divide and
remainder . [Note: Primitive boolean values can be output as the word “true” or the word “false” with
format specifier %b .]
 */
package chapter8classesandobjects;
import java.util.Arrays;
/**
 *
 * @author kuna
 */
public class HugeInteger extends Object{
    private static int[] array = new int[40];
    private int arrayIndex = 0;
    
    HugeInteger(int[] array) {
        this.array = array;
    }
  
    public void parse(String digit) {
        for(int count = 0; count < digit.length();  count++){
            int num = digit.charAt(count);
            array[arrayIndex] = num;
            arrayIndex++;
        }
       
    }
    
   public void toPrint() {
        for(int i = 0; i< array.length; i++) {
            System.out.printf("%d, ", array[i]);
           }
    }
   
    public boolean isEqualTo(int[] array1, int[] array2){
       boolean test = Arrays.equals(array1, array2);
       return test;
   }
   
    public boolean isNotEqualTo(int[] array1, int[] array2) {
       boolean test = Arrays.equals(array1, array2);
       if(test == false) 
           test = true;
       else
           test = false;
       return test;
    }
    
    //tests if one huge integer object is greater than the other by comparing the length of the arrays
    public boolean isGreaterThan(int[] array1, int[] array2) {
        boolean test;
        if(array1.length > array2.length)
            test = true;
        else
            test = false;
        return test;
    }
    //tests if one huge integer object is greater than the other by comparing the length of the arrays
    public boolean isLessThan(int[] array1, int[] array2) {
        boolean test;
        if(array1.length < array2.length)
            test = true;
        else
            test = false;
        return test;
    }
   
}
