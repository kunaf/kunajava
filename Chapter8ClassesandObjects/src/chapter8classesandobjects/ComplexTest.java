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
public class ComplexTest {

    public static void main(String[] args) {
        
        COmplexNumbers complex1 = new COmplexNumbers(23,5);
        COmplexNumbers complex2 = new COmplexNumbers(4,8);
        COmplexNumbers complex = new COmplexNumbers();
       
        complex.addComplex(complex1, complex2);
        complex.subtractComplex(complex1, complex2);
        
    }
    
}
