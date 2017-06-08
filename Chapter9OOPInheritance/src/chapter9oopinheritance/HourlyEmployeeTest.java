/*
 *(Creating a New Subclass of Employee ) Other types of Employee s might include Salaried-
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
 * @author kuna
 */
public class HourlyEmployeeTest {

    public static void main(String[] args) {
        
        HourlyEmployee hemployee = new HourlyEmployee("Britney", "Gift", "123-234-456", 20.5, 200);
        
        // get base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",hemployee.getFirstName() );
        System.out.printf("%s %s%n", "Last name is",hemployee.getLastName() );
        System.out.printf("%s %s%n", "Social security number is",hemployee.getSSN() );
        System.out.printf("%s %.2f%n", "Hours Worked is",hemployee.getHours());
        System.out.printf("%s %.2f%n", "Wage per Hour is",hemployee.getWage() );
        System.out.printf("%s %.2f%n", "Earning is",hemployee.earnings());
        
        System.out.println("\n\nUsing to Striing method");
        System.out.println(hemployee.toString());
        
    }
    
}
