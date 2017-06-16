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
public class PayableInterfaceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a 6 element payable array
        Payable[] payable = new Payable[6];
        
        //Create date objects for each employee
        Date employee1 = new Date(07, 15, 2004);
        Date employee2 = new Date(03, 25, 2001);
        Date employee3 = new Date(10, 10, 2000);
        Date employee4 = new Date(12, 30, 2004);
        Date employee5 = new Date(04, 25, 2000);
        //current date object
        Date current = new Date(03, 14, 2015);
        
        // populate array with objects that implement Payable
        payable[0] = new Invoice("01234", "Wind Screen", 2, 375.00);
        payable[1] = new Invoice("56789", "tire", 4, 79.95);
        payable[2] = new MSalariedEmployee("Britney", "Gift", "123BG", employee1.getBirthDate(), 10000.00);
        payable[3] = new MHourlyEmployee("Faith", "Endam", "123FE", employee2.getBirthDate(), 5000, 10.0);
        payable[4] = new MCommisionEmployee("Cake", "Ludima", "456CL", employee3.getBirthDate(),34555.98, 0.4);
        payable[5] = new MBasePlusCommisionEmployee("Mark", "Garaet", "456MG", employee4.getBirthDate(), 120000.78, 
                                                    0.65, 500000);
        //payable objects processed individually
        System.out.println("String Representation of Payable Objects");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",payable[0], "Payment", payable[0].getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",payable[1], "Payment", payable[1].getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",payable[2], "Payment", payable[2].getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",payable[3],"Payment", payable[3].getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",payable[4],"Payment", payable[4].getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",payable[5],"Payment", payable[5].getPaymentAmount());
        
        //invoices and objects processed polymorphically
        System.out.println("Payable objects processed polymorphically\n\n");
        for(Payable currentpayable:payable) {
            
            // downcast Employee reference to BasePlusCommissionEmployee reference
           /* if currentemployee instanceof BasePlusCommisionEmployee() {
                BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentemployee ;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
            }//end if */
           
            //output currentpayable and its payment amount
            System.out.printf("%s%n%s: $%,.2f%n", currentpayable.toString(), "Payment", currentpayable.getPaymentAmount());
            System.out.println();
        }
        
    }
    
}
