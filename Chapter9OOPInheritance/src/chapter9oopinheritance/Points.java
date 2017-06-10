/*
 * ( Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral, 
parallelogram, rectangle and Square . Use Quadrilateral as the superclass
of the hierarchy. Create and use a Podouble class to represent the points in each shape. Make the hier-
archy as deep (i.e., as many levels) as possible. Specify the instance variables and methods for each
class. The private instance variables of Quadrilateral should be the x-y coordinate pairs for the
four endpoints of the Quadrilateral . Write a program that instantiates objects of your classes and
outputs each object’s area (except Quadrilateral ).
 */
package chapter9oopinheritance;

/**
 * @author kuna
 */
public class Points {
    private double x; //x coordinate 
    private double y; //y coordinate
    
    Points(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //get method for x coordinate 
    public double getXCo() {
        return this.x;
    }
    //set method for y coordinate
    public void setXCo(double x) {
        this.x = x;
    }
    //get method for y coordinate
    public double getYCo() {
        return this.y;
    }
    //set method for y coordinate
    public void setYCo(double y) {
        this.y = y;
    }
    
    //method multiply will multiply contents of a point
    public double multCoords(Points point) {
        double result = point.x * point.y;
        return result;
    }
    
    //to string method to print
    @Override
    public String toString() {
        return String.format("%s (%.1f, %.1f)", "Point", getXCo(), getYCo());
    }
}
