/*
 * (File Matching) Self-Review Exercise 15.2 asked you to write a series of single statements.
Actually, these statements form the core of an important type of file-processing program—namely,
a file-matching program. In commercial data processing, it’s common to have several files in each
application system. In an accounts receivable system, for example, there’s generally a master file con-
taining detailed information about each customer, such as the customer’s name, address, telephone
number, outstanding balance, credit limit, discount terms, contract arrangements and possibly a
condensed history of recent purchases and cash payments.

As transactions occur (i.e., sales are made and payments arrive in the mail), information about
them is entered into a file. At the end of each business period (a month for some companies, a
week for others, and a day in some cases), the file of transactions (called "trans.txt" ) is applied to
the master file (called "oldmast.txt" ) to update each account’s purchase and payment record.
During an update, the master file is rewritten as the file "newmast.txt" , which is then used at the
end of the next business period to begin the updating process again.
File-matching programs must deal with certain problems that do not arise in single-file pro-
grams. For example, a match does not always occur. If a customer on the master file has not made
any purchases or cash payments in the current business period, no record for this customer will
appear on the transaction file. Similarly, a customer who did make some purchases or cash pay-
ments could have just moved to this community, and if so, the company may not have had a
chance to create a master record for this customer.
Write a complete file-matching accounts receivable program. Use the account number on
each file as the record key for matching purposes. Assume that each file is a sequential text file with
records stored in increasing account-number order.
a) Define class TransactionRecord . Objects of this class contain an account number and
amount for the transaction. Provide methods to modify and retrieve these values.

 */
package chapter15;

/**
 * @author kuna
 */
import java.io.Serializable;

public class TransactionRecord implements Serializable{
   
    private int accountNumber;
    private double amount;
    
     //initializes account with provided values
    public TransactionRecord(int accountNumber, double amount) {
        
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int acc) {
        accountNumber = acc; 
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amt) {
        amount = amt;
    }
    
}
