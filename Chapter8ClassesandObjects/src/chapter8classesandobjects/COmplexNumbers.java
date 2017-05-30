/*
 * (Complex Numbers) Create a class called Complex for performing arithmetic with complex
numbers. Complex numbers have the form
realPart + imaginaryPart * i
where i is sqrt(– 1)
Write a program to test your class. Use floating-point variables to represent the private data of the
class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts
are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from
the real part of the left operand, and the imaginary part of the right operand is sub-
tracted from the imaginary part of the left operand.
c) Print Complex numbers in the form ( realPart , imaginaryPart ) .
 */
package chapter8classesandobjects;
import static java.lang.Math.*;
/**
 *
 * @author kuna
 */
public class COmplexNumbers {
    
    private int imaginary;
    private int real;
    
    COmplexNumbers() {
        this(0,0);
    }
    COmplexNumbers(int real, int imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }
    
    public int getReal(COmplexNumbers comp) {
        int realVal = comp.real;
        return realVal;
    }
    
    public int getIma(COmplexNumbers comp) {
        int imagi = comp.imaginary;
        return imagi;
    }
    
    public void addComplex(COmplexNumbers comp1, COmplexNumbers comp2) {
        int realSum = getReal(comp1) + getReal(comp2);
        int imagi = getIma(comp1) + getIma(comp2);
        
        System.out.printf("(%d, %di)", realSum, imagi);
    }
    
     public void subtractComplex(COmplexNumbers comp1, COmplexNumbers comp2) {
        int realSum = getReal(comp1) - getReal(comp2);
        int imagi = getIma(comp1)  - getIma(comp2);
        
        System.out.printf("(%d, %di)", realSum, imagi);
    }
}



