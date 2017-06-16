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
public class PayrollSystemTest {

    public static void main(String[] args) {
        //Create date objects for each employee
        Date employee1 = new Date(07, 15, 2004);
        Date employee2 = new Date(03, 25, 2001);
        Date employee3 = new Date(10, 10, 2000);
        Date employee4 = new Date(12, 30, 2004);
        Date employee5 = new Date(04, 25, 2000);
        //current date object
        Date current = new Date(03, 14, 2015);
        
        //create subclass objects
        SalariedEmployee salEmp = new SalariedEmployee("Britney", "Gift", "123BG", employee1.getBirthDate(), 10000.00);
        HourlyEmployee hourEmp = new HourlyEmployee("Faith", "Endam", "123FE", employee2.getBirthDate(), 5000, 10.0);
        CommisionEmployee comEmp = new CommisionEmployee("Cake", "Ludima", "456CL", employee3.getBirthDate(), 34555.98, 0.4);
        BasePlusCommisionEmployee bpEmp = new BasePlusCommisionEmployee("Mark", "Garaet", "456MG", employee4.getBirthDate(), 
                                                    120000.78, 0.65, 500000);
        PieceWorker pwEmp = new PieceWorker("Kevin", "Lingopa", "678KL", employee5.getBirthDate(), 55000, 30);
        
        //employee processed individually
        System.out.printf("%n%s%n%s: $%,.2f%n%n",salEmp, "earned", salEmp.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourEmp, "earned", hourEmp.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",comEmp, "earned", comEmp.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",bpEmp,"earned", bpEmp.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",pwEmp,"earned", pwEmp.earnings());
        
        //create employee array
        Employee[] employees = new Employee[5]; 
        
        //array initialisation
        employees[0] = salEmp;
        employees[1] = hourEmp;
        employees[2] = comEmp;
        employees[3] = bpEmp;
        employees[4] = pwEmp;
        
        //employee processed polymorphically
        for(Employee currentemployee: employees) {
            
            System.out.println(currentemployee); //invokes to string
            // downcast Employee reference to BasePlusCommissionEmployee reference
           /* if currentemployee instanceof BasePlusCommisionEmployee() {
                BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentemployee ;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
            }//end if */
            
            if(currentemployee.getBirthDate().getMonth() == current.getMonth()) {
                double bonus = currentemployee.earnings();
                bonus += 100.00;
                System.out.printf("earned $%,.2f%n%n", bonus );
            }
            else 
                System.out.printf("earned $%,.2f%n%n", currentemployee.earnings() );
        }
    }
    
}
