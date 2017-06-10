/*
 *( Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral, parallelogram, rectangle
and Square . Use Quadrilateral as the superclass
of the hierarchy. Create and use a Point class to represent the points in each shape. Make the hier-
archy as deep (i.e., as many levels) as possible. Specify the instance variables and methods for each
class. The private instance variables of Quadrilateral should be the x-y coordinate pairs for the
four endpoints of the Quadrilateral . Write a program that instantiates objects of your classes and
outputs each object’s area (except Quadrilateral ).
 */
package chapter9oopinheritance;

/**
 * @author kuna
 */
public class TrapInherits extends ParaInherits{
    
    //constructor
    TrapInherits(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        
        //calling instance variables of super class
        super(x1, y1, x2, y2, x3, y3, x4, y4, height);
        
    }
    
    //to string method
    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%.1f%n","Trapezoid", super.toString(), "Area", getArea());
    }
}
