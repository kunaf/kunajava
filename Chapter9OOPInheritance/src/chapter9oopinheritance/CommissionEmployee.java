/*
 *( Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
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
//class commision employee inherits from class employee heirachy
public class CommissionEmployee extends EmployeeHierarchy{
    //instance variable declaration of subclass commision employee
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
        //call instance variables of super class
        super(firstName, lastName, SSN);
        //validity check on gross sales and commision rate
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Incorrect gross sale");
        if(commissionRate < 0.0 || commissionRate > 1.0) 
            throw new IllegalArgumentException("Incorrect commmission rate");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    //get method for gross sales
    public double getGrossSales() {
        return this.grossSales;
    }
    //get method for commision rate
    public double getCommision() {
        return this.commissionRate;
    }
    //set method for gross sales
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Incorrect. Gross sales must be greater than 0.0");
        
        this.grossSales = grossSales;
    }
    public void setCommision(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0) 
            throw new IllegalArgumentException("Incorrect. Commission rate must be greater be a value between 0 and 1.0");
        
        this.commissionRate = commissionRate;
    }
    //public method earnings
    public double earnings() {
        return getCommision() * getGrossSales();
    }
    
    @Override
    public String toString() {
        return String.format("%s%n%s%n%s: %.2f%n%s: %.2f","Employee Info", super.toString(),"Gross Sales", getGrossSales(), 
                "Commission Rate",getCommision());
    }
}
