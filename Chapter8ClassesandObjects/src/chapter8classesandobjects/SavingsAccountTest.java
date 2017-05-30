/*
 *(Savings Account Class) Create class SavingsAccount . Use a static variable annualInter-
estRate to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
Balance . Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount . Instantiate two savingsAccount objects,
saver1 and saver2 , with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
 */
package chapter8classesandobjects;

/**
 *
 * @author kuna
 */
public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccountClass saver1 = new SavingsAccountClass(2000.00) ;
        SavingsAccountClass saver2 = new SavingsAccountClass(3000.00) ;
        
        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);
        
        System.out.println("Interest rate 4%");
        System.out.printf("Balance for Saver1: %.2f\nBalance for Saver2: %.2f\n", saver1.calcMonthlyInterest(), saver2.calcMonthlyInterest());
        
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);
        System.out.println("Interest rate 5%");
        System.out.printf("Balance for Saver1: %.2f\nBalance for Saver2: %.2f\n", saver1.calcMonthlyInterest(), saver2.calcMonthlyInterest());
        
    }
    
}
