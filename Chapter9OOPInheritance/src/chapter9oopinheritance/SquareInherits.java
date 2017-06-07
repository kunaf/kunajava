/*
 * ( Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral, parallelogram, rectangle
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
public class SquareInherits extends QuadrilateralHierachy{
    
    public SquareInherits(Points point1, Points point2, Points point3, Points point4) {
        //call to superclass constructor
        super(point1,point2,point3,point4);
    }
    
    
    
    public int areaSquare(Points point3) {
        int area = point3.multCoords(point3);
        return area;
    }
}
