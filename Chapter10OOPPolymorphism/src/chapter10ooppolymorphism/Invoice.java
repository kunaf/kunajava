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
public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantity,double pricePerItem){
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        if (pricePerItem < 0.0) // validate pricePerItem
            throw new IllegalArgumentException("Price per item must be >= 0");

        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    } // end constructor

    // get part number
    public String getPartNumber(){
        return partNumber; // should validate
    }
    // get description
    public String getPartDescription(){
        return partDescription;
    }
    // set quantity
    public void setQuantity(int quantity){
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        this.quantity = quantity;
    }
    // get quantity
    public int getQuantity(){
        return quantity;
    }
    // set price per item
    public void setPricePerItem(double pricePerItem){
        if (pricePerItem < 0.0) // validate pricePerItem
            throw new IllegalArgumentException("Price per item must be >= 0");
        this.pricePerItem = pricePerItem;
    }   
    // get price per item
    public double getPricePerItem(){
        return pricePerItem;
    }
    // return String representation of Invoice object
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "invoice", "part number", getPartNumber(), 
                getPartDescription(),"quantity", getQuantity(), "price per item", getPricePerItem());
    }
    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem(); // calculate total cost
    }
} // end class Invoice

