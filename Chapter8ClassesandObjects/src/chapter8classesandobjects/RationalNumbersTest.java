/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;

/**
 *
 * @author kuna
 */
public class RationalNumbersTest {

    public static void main(String[] args) {
        
        RationalNumbers number1 = new RationalNumbers(2,4);
        RationalNumbers number2 = new RationalNumbers(5,8);
        RationalNumbers result = new RationalNumbers();
        
        result.lowestForm(number2);
       
        
    }
    
}
