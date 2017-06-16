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
public class MHourlyEmployee extends MEmployee {
    private double wage; // wage per hour
    private double hours; // hours worked for week
    // constructor
    public MHourlyEmployee(String firstName, String lastName,String socialSecurityNumber, Date birthdate, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber, birthdate);
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.wage = wage;
        this.hours = hours;
    }
    // set wage
    public void setWage(double wage){
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        this.wage = wage;
    }
    // return wage
    public double getWage(){
        return wage;
    }
    // set hours worked
    public void setHours(double hours){
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }
    // return hours worked
    public double getHours(){
        return hours;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double getPaymentAmount(){
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
    // return String representation of HourlyEmployee object
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getWage(),
                            "hours worked", getHours());
    }
} // end class HourlyEmployee

