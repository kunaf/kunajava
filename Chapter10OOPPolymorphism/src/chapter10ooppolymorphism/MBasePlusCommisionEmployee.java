/*
 *(Accounts Payable System Modification) In this exercise, we modify the accounts payable
application of Figs. 10.11–10.15 to include the complete functionality of the payroll application of
Figs. 10.4–10.9. The application should still process two Invoice objects, but now should process
one object of each of the four Employee subclasses. If the object currently being processed is a Base-
PlusCommissionEmployee , the application should increase the BasePlusCommissionEmployee ’s base
salary by 10%. Finally, the application should output the payment amount for each object. Com-
plete the following steps to create the new application:
a) Modify classes HourlyEmployee (Fig. 10.6) and CommissionEmployee (Fig. 10.7) to place
them in the Payable hierarchy as subclasses of the version of Employee (Fig. 10.13) that
implements Payable . [Hint: Change the name of method earnings to getPaymentAmount
in each subclass so that the class satisfies its inherited contract with interface Payable .]
b) Modify class BasePlusCommissionEmployee (Fig. 10.8) such that it extends the version
of class CommissionEmployee created in part (a).
c) Modify PayableInterfaceTest (Fig. 10.15) to polymorphically process two Invoice s,
one SalariedEmployee , one HourlyEmployee , one CommissionEmployee and one Base-
PlusCommissionEmployee . First output a String representation of each Payable object.
Next, if an object is a BasePlusCommissionEmployee , increase its base salary by 10%. Fi-
nally, output the payment amount for each Payable object.
 */
package chapter10ooppolymorphism;

/**
 *
 * @author kuna
 */
public class MBasePlusCommisionEmployee extends MCommisionEmployee{
     private double baseSalary; // base salary per week
    
    // constructor
    public MBasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthdate,
                                double grossSales,double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, birthdate, grossSales, commissionRate);
        
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }
    // set base salary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }
    // return base salary
    public double getBaseSalary(){
        return baseSalary;
    }   
    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    
    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f","base-salaried", super.toString(),
                            "base salary", getBaseSalary());
    }
} // end class BasePlusCommissionEmployee

