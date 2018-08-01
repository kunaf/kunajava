/*
 * Modify class Account in Fig. 15.9 to include method combine , which takes a Transac-
tionRecord object and combines the balance of the Account object and the amount val-
ue of the TransactionRecord object.
 */
package chapter15;

/**
 * @author kuna
 */
import java.io.Serializable;

public class Account implements Serializable {
    
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;
    private TransactionRecord trans;
    
    public Account(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    //get metod for account number
    public int getAccountNumber() {
        return accountNumber;
    }
    //get method for first name
    public String getFirstName() {
        return firstName;
    }
    //get method for last name
    public String getLastName() {
        return lastName;
    }
    //geet method for account balane
    public double getBalance() {
        return balance;
    }
    
    //set method for account number
    public void setAccountNumber(int accNum) {
        accountNumber = accNum;
    }
    
     //set method for first Name
    public void setFirstName(String fname) {
        firstName = fname;
    }
    
     //set method for last name
    public void setLastName(String lname) {
        lastName = lname;
    }
    
     //set method for account balance
    public void setBalance(double bal) {
        balance = bal;
    }
    
    //method adds transaction amount to balance (take note)
    public double combine() {
        double total = trans.getAmount() + getBalance();
        return total;
    }
    
}
