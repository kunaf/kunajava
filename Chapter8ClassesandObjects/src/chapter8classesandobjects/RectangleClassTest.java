/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class RectangleClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        RectangleClass rect = new RectangleClass(1,1);
        
        try{
             System.out.println("Enter value for length");
            float lenght = input.nextInt();
            rect.setLength(lenght);
        }
        catch(IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }
        try{
            System.out.println("Enter value for width");
            float width = input.nextInt();
            rect.setWidth(width);
        }
        catch(IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }
        
        float area = rect.area(rect.getLength(), rect.getWidth());
        float perimeter = rect.perimeter(rect.getLength(), rect.getWidth());
        
        System.out.printf("Area: %.1f\nPerimeter: %.1f\n", area, perimeter);
    }
    
}
