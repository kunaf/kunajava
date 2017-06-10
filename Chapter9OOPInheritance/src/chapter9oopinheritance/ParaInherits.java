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
 *
 * @author kuna
 */
public class ParaInherits extends  QuadrilateralHierachy{
    //instance variable declaration
    double height; 
    
    //constructor
    ParaInherits(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        
        //calling instance variables of super class
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        
        this.height = height;
    }
    //method calculates the sum of sides(horizontal sides) of the trapezoid
    //checks if the y coordinates of point 1 and 2 are the same. if they are then the point 1 and point 2 are on the same 
    //plane and so the value of one side will be the differnce of the x coordinate of point1 and ppoint 2 plus the 
    //difference of the xcoordinate of point 3 and point 4
    public double getSumOfSides() {
        if(getPoint1().getYCo() == getPoint2().getYCo()) 
           return Math.abs((getPoint1().getXCo() - getPoint2().getXCo()) + (getPoint3().getXCo() - getPoint4().getXCo()));
        else 
            return Math.abs(getPoint1().getXCo() - getPoint4().getXCo()) + (getPoint2().getXCo() - getPoint3().getXCo());
    }
    //calculates the height(vertical side) of the trapezoid
    //checks if the y coordinates are the same. if yes then the difference of the ycoordinate of point 1 and any other
    //point is calculated. else the difference of the ycoordinate of point 1 and point 2 is calculated
    public double getHeight(){
        if(getPoint1().getYCo() == getPoint2().getYCo())
            height =  Math.abs(getPoint1().getYCo() - getPoint3().getYCo());
        else
               height =  Math.abs(getPoint1().getYCo() - getPoint2().getYCo());
        return height;
    }
    //method calulates the area of of the trapezoid which is sum of sides(horizontal) x height / 2
    public double getArea() {
        return getSumOfSides() * getHeight() / 2.0;
    }
    
    //to string method
    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%.1f%n","Trapezoid", super.toString(), "Area", getArea());
    }
}
