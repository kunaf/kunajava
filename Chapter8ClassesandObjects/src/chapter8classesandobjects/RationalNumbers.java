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
    
    public static int GCD(int a, int b) {
        int r = 1, gcd = 1;//remainder;
       
            while(r!=0) {
                r = a%b;
                a = b;
                gcd = b;
                b = r;
            }
        return Math.abs(gcd);
    }
    
    public int getNumerator(RationalNumbers number) {
        int numerator = number.num;
        return numerator;
    }
    
     public int getDenom(RationalNumbers number) {
        int denomin = number.denum;
        return denomin;
    }
    //reduces fraction to lowest form by gettiing gcd of numbers and dividing ech number the gcd
    public RationalNumbers lowestForm(RationalNumbers number) {
        int num = getNumerator(number);
        int denum = getNumerator(number);
        int gcd = GCD(num, denum);
        num = num/gcd;
        denum = denum/gcd;
        
        RationalNumbers ration = new RationalNumbers(num, denum);
        System.out.printf("(%d/%d)", getNumerator(ration), getDenom(ration));
        return ration;
        
    } 
    /*//method adds two fractions   
    public void addFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = (getNumerator(number1) * getDenom(number2)) + (getNumerator(number2) * getDenom(number1));
        int denumer = getDenom(number1) * getDenom(number2);
        RationalNumbers rat = new RationalNumbers(numer, denumer);
        rat = lowestForm(numer, denumer);
        System.out.printf("(%d/%d)", getNumerator(rat), getDenom(rat));
    }
    //method subtracts a fraction from another
    public void subFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = (getNumerator(number1) * getDenom(number2)) - (getNumerator(number2) * getDenom(number1));
        int denumer = getDenom(number1) * getDenom(number2);
        RationalNumbers rat = new RationalNumbers(numer, denumer);
        rat = lowestForm(numer, denumer);
        System.out.printf("(%d/%d)", getNumerator(rat), getDenom(rat));
    }
    //method divides one fraction by another
    public void divideFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = getNumerator(number1) * getDenom(number2);
        int denumer = getNumerator(number2) * getDenom(number1);
        RationalNumbers rat = new RationalNumbers(numer, denumer);
        rat = lowestForm(numer, denumer);
        System.out.printf("(%d/%d)", getNumerator(rat), getDenom(rat));

    }
    //method multiplies one fraction by another 
    public void multiplyFraction(RationalNumbers number1, RationalNumbers number2) {
        int numer = getNumerator(number1) * getNumerator(number2);
        int denumer = getDenom(number1) * getDenom(number1);
        RationalNumbers rat = new RationalNumbers(numer, denumer);
        rat = lowestForm(numer, denumer);
        System.out.printf("(%d/%d)", getNumerator(rat), getDenom(rat));
      // return rat;
    } */
    
    
}
