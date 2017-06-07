/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9oopinheritance;
/**
 * @author kuna
 */
public class EmployeeHierarchy {
    //declaration of class instance variables
    private final String firstName;
    private final String lastName;
    private final String SSN;
    
    //constructor for emmployee heirachy
    public EmployeeHierarchy(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    //get method for last name
    public String getLastName() {
        return this.lastName;
    }
    //get method for first name
    public String getFirstName() {
        return this.firstName;
    }
    //get method for social security number
    public String getSSN() {
        return this.SSN;
    }
    @Override
    //to string method
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "Employee Name", getFirstName(), getLastName(), "Social Security Number"
                ,getSSN());
    }
}
