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
 *
 * @author kuna
 */
public class BasePlusCommisionEmployee extends CommissionEmployee{
    //instance variable declaration
    private double baseSalary;
    
    //class base plus commision employee constructor
    public BasePlusCommisionEmployee(String firstName, String lastName, String SSN, double grossSales,
                                     double commissionRate, double baseSalary) {
        //instantiates super class instance variables
        super(firstName, lastName, SSN, grossSales, commissionRate);
        //validity check for base salary
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Incorrect gross sale");  
        }
        
        this.baseSalary = baseSalary;
    }
    //get method for instance variable base salary
    public double getBaseSalary() {
        return this.baseSalary;
    }
    //set method for instance variable base salary
    public void setBaseSalary(double baseSalary) {
        //validity check for base salary
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Incorrect gross sale");  
        }
        
        this.baseSalary = baseSalary;
    }
    
    //earnings method overides earning method for commision employee
    @Override
    public double earnings(){
        return baseSalary + super.earnings();
    }
    @Override
    //to string method
    public String toString() {
        return String.format("%s%n%s: %.2f", super.toString(),"Base Salary",getBaseSalary());
    } //method calls toString method of the super class
    
}
