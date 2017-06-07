/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9oopinheritance;

/**
 *
 * @author kuna
 */
public class SquareInheritsTests {

    
    public static void main(String[] args) {
        Points point1 = new Points(0,0);
        Points point2 = new Points(5,0);
        Points point3 = new Points(5,5);
        Points point4 = new Points(0,5);
        
        SquareInherits square = new SquareInherits(point1, point2, point3, point4);
        
        
    }
    
}
