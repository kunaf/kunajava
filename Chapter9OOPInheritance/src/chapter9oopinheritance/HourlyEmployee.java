/*
 * (Creating a New Subclass of Employee ) Other types of Employee s might include Salaried-
who get paid a fixed weekly salary, PieceWorker s who get paid by the number of pieces
they produce or HourlyEmployee s who get paid an hourly wage with time-and-a-half—1.5 times the
hourly wage—for hours worked over 40 hours.
Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
instance variable hours (a double ) that represents the hours worked, instance variable wage (a dou-
ble ) that represents the wages per hour, a constructor that takes as arguments a first name, a last
name, a social security number, an hourly wage and the number of hours worked, set and get meth-
ods for manipulating the hours and wage , an earnings method to calculate an HourlyEmployee ’s
earnings based on the hours worked and a toString method that returns the HourlyEmployee ’s
String representation. Method setWage should ensure that wage is nonnegative, and setHours
should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.
 */
package chapter9oopinheritance;

/**
 *
 * @author kuna
 */
public class HourlyEmployee extends EmployeeHierarchy{
    //instance variable declaration for class hourly employee
    private double hours;
    private double wage;
    //constructor for class hourly employee
    HourlyEmployee(String firstName, String lastName, String SSN, double hours, double wage) {
        
        //initialises constructor with instance variables of the super class
        super(firstName, lastName, SSN);
        
        this.hours = hours;
        this.wage = wage;
    }
    
    //get method for hours worked
    public double getHours() {
        return this.hours;
    }
    
    //get method for wages per hour
    public double getWage() {
        return this.wage;
    }
    
    //set method for hours worked
    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Incorrect: Hours should be a value between 0.0 and 168.0");
        }
        this.hours = hours;
    }
    //set method for wages per hour
    public void setWage(double wage) {
        if(wage < 0.0) 
            throw new IllegalArgumentException("Incorrect: Wage should be a value greater than 0.0");
    }
    //method earnings calculates the earnings of an hourly employee
    //method earnings is a product of hours and wage per hour
    public double earnings() {
        return getHours() * getWage();
    }
    
    //to string method for houly employee class
    @Override
    public String toString() {
        return String.format("%s%n%s%n%s: %.2f%n%s: %.2f", "Employee Info", super.toString(),"Hours Worked",getHours(),
                            "Wage per hour", getWage());
    }
}
