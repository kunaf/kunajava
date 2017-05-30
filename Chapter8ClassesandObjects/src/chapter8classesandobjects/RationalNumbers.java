/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;
import chapter6.GreatestCommonDivisor.GCD;
/**
 *
 * @author kuna
 */
public class RationalNumbers {
    private int num;
    private int denum;
    
    RationalNumbers() {
        this(0,0);
    }
    
    RationalNumbers(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }
    
    public int getNumerator(RationalNumbers number) {
        int numerator = number.num;
        return numerator;
    }
    
     public int getDenom(RationalNumbers number) {
        int denomin = number.num;
        return denomin;
    }
    
    public void addFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = (getNumerator(number1) * getDenom(number2)) + (getNumerator(number2) * getDenom(number1));
        int denumer = getDenom(number1) * getDenom(number2);
        
        System.out.printf("(%d/%d)", numer, denumer);
    }
    
    public void subFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = (getNumerator(number1) * getDenom(number2)) - (getNumerator(number2) * getDenom(number1));
        int denumer = getDenom(number1) * getDenom(number2);
        
        System.out.printf("(%d/%d)", numer, denumer);
    }
    
}
