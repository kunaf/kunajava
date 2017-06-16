/*
 * Modify the payroll system of Figs. 10.4–10.9 to include pri-
vate instance variable birthDate in class Employee . Use class Date of Fig. 8.7 to represent an em-
ployee’s birthday. Add get methods to class Date . Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee ’s birthday occurs.
 */
package chapter10ooppolymorphism;

/**
 *
 * @author kuna
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    // constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,Date birthdate, 
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
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getWeeklySalary();
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
} // end class SalariedEmployee
