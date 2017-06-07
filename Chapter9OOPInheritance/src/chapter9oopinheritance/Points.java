/*
 * ( Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral, 
parallelogram, rectangle and Square . Use Quadrilateral as the superclass
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
public class Points {
    private int x; //x coordinate 
    private int y; //y coordinate
    
    Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //get method for x coordinate 
    public int getXCo() {
        return this.x;
    }
    //set method for y coordinate
    public void setXCo(int x) {
        this.x = x;
    }
    //get method for y coordinate
    public int getYCo() {
        return this.y;
    }
    //set method for y coordinate
    public void setYCo(int y) {
        this.y = y;
    }
    
    //method multiply will multiply contents of a point
    public int multCoords(Points point) {
        int result = point.x * point.y;
        return result;
    }
    
    //to string method to print
    @Override
    public String toString() {
        return String.format("%s (%d, %d)", "Point", getXCo(), getYCo());
    }
}
