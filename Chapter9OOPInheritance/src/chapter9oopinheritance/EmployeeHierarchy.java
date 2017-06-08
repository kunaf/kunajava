/*( Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
inherited from class CommissionEmployee . However, not all types of
employees are CommissionEmployee s. In this exercise, you’ll create a more general Employee superclass
that factors out the attributes and behaviors in class CommissionEmployee that are common to all Em-
ployee s. The common attributes and behaviors for all Employee s are firstName , lastName , socialSe-
curityNumber , getFirstName , getLastName , getSocialSecurityNumber and a portion of method
toString . Create a new superclass Employee that contains these instance variables and methods and a
constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee .
Class CommissionEmployee should contain only the instance variables and methods that are not de-
clared in superclass Employee . Class CommissionEmployee ’s constructor should invoke class Employee ’s
constructor and CommissionEmployee ’s toString method should invoke Employee ’s toString method.
Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommis-
sionEmployeeTest apps using these new classes to ensure that the apps still display the same results for
a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.
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
