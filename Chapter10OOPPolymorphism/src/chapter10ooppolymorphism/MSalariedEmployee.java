/*
 * (Accounts Payable System Modification) In this exercise, we modify the accounts payable
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
public class MSalariedEmployee extends MEmployee{
     private double weeklySalary;
    
    // constructor
    public MSalariedEmployee(String firstName, String lastName, String socialSecurityNumber,Date birthdate, 
            double weeklySalary){
        super(firstName, lastName, socialSecurityNumber, birthdate);
        
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    // set salary
    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }
    // return salary
    public double getWeeklySalary(){
        return weeklySalary;
    }
    // return String representation of SalariedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f",
                            super.toString(), "weekly salary", getWeeklySalary());
    }
    public void bonus() {
         this.weeklySalary += 100.00;
    }
    
    // calculate earnings; implement interface Payable method that was
    // abstract in superclass Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
} // end class SalariedEmployee


