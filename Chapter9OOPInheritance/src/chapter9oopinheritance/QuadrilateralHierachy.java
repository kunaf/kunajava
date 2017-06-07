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
public class QuadrilateralHierachy {
    //class points have composition relationship with class quadrilateral
    //instance variables 
    private Points point1; // first point 
    private Points point2; //second point
    private Points point3; // third point
    private Points point4; // four point
    
    public QuadrilateralHierachy(Points point1, Points point2, Points point3, Points point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }
    //get method for point 1 of the quadrilateral
    public Points getPoint1() {
        return this.point1;
    }
    //get method for point 2 of the quadrilateral
    public Points getPoint2() {
        return this.point2;
    }
    //get method for point 3 of the quadrilateral
    public Points getPoint3() {
        return this.point3;
    }
    //get method for point 4 of the quadrilateral
    public Points getPoint4() {
        return this.point4;
    }
    //set method for point 1 of the quadrilateral
    public void setPoint1(Points point1) {
        this.point1 = point1;
    }
    //set method for point 2 of the quadrilateral
    public void setPoint2(Points point2) {
        this.point1 = point2;
    }
    //set method for point 3 of the quadrilateral
    public void setPoint3(Points point3) {
        this.point1 = point3;
    }
    //set method for point 4 of the quadrilateral
    public void setPoint4(Points point4) {
        this.point1 = point4;
    }
    
    
}

