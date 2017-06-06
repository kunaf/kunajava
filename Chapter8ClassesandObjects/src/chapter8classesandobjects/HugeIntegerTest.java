/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;

import java.util.Arrays;
/**
 *
 * @author kuna
 */
public class HugeIntegerTest {

    public static void main(String[] args) {
        //huge integer object
        int[] array = new int[10];
        HugeInteger huge = new HugeInteger(array);
        huge.parse("kuna");  //calling method parse
        huge.toPrint();//calling ,method print to print array elements
        System.out.println("\n\n\n\n");
        //huge integer object
        int[] array1 = new int[10];
        HugeInteger huge1 = new HugeInteger(array1);
        huge1.parse("cake");
        huge1.toPrint();
        
        int[] array2 = new int[10];
        HugeInteger huge2 = new HugeInteger(array2);
        
        System.out.println();
        
        boolean test = huge2.isEqualTo(array1, array);
        System.out.println(test);
        boolean test1 = huge2.isNotEqualTo(array1, array);
        System.out.println(test1);
        
        
    }
    
}
