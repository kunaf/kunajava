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
public class ComissionEmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee cemployee = new CommissionEmployee("Britney", "Gift", "123-234-456", 2000.000, 0.3);
        
        System.out.println(cemployee.toString());
    }
    
}
