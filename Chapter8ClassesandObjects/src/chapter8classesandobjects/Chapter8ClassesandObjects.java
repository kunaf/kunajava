/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import static java.lang.Math.*;
/**
 *
 * @author kuna
 */
public class Chapter8ClassesandObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.printf("sqrt: %f", sqrt(-1));
        
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        int count = 1;
        System.out.printf("%4d%20s%n",count ,NumberFormat.getCurrencyInstance(Locale.TRADITIONAL_CHINESE).format(principal) );
    }
    
}
