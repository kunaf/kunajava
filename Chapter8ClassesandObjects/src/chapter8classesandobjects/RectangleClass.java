/*
 *(Rectangle Class) Create a class Rectangle with attributes length and width , each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width . The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle .
 */
package chapter8classesandobjects;

/**
 *
 * @author kuna
 */
public class RectangleClass {
    
    private float length = 1;
    private float width = 1;
    
    public RectangleClass(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public float perimeter(float length, float width) {
        return (length + width)/2;
    }
    
    public float area(float length, float width){
        return length * width;
    }
    
    public float getLength() {
        return this.length;
    }
    
    public float getWidth() {
        return this.width;
    }
    
    public void setWidth(float width) {
        if(width <= 0.0 || width > 20.0) 
            throw new IllegalArgumentException("width must be between 0.0 and 20.0");
        this.width = width;
    }
    
     public void setLength(float length) {
         if(length <= 0.0 || length > 20.0)
             throw new IllegalArgumentException("lenght must be a value between 0.0 and 20.0\n");
         this.length = length;
    }
    
}
