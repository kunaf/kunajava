/*
 * (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
additional Employee subclass PieceWorker that represents an employee whose pay is based on the
number of pieces of merchandise produced. Class PieceWorker should contain private instance
variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
produced). Provide a concrete implementation of method earnings in class PieceWorker that cal-
culates the employee’s earnings by multiplying the number of pieces produced by the wage per
piece. Create an array of Employee variables to store references to objects of each concrete class in
the new Employee hierarchy. For each Employee , display its String representation and earnings.
 */
package chapter10ooppolymorphism;

/**
 *
 * @author kuna
 */
public class PieceWorker extends Employee{
     private double wage; //wage per piece
    private int pieces; //number of pieces of merchandise produced
    
    //constructor
    public PieceWorker(String firstName, String lastName,String socialSecurityNumber, Date birthdate, 
                        double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthdate);
        
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be a value greater than or equal to zero");
        }
        if(pieces < 0)
            throw new IllegalArgumentException("Piece must be a value greater than or equal to zero");
        
        this.wage = wage;
        this.pieces = pieces;
    }
    
    //set wage
    public void setWage(double wage) {
        if(wage < 0.0) {
            throw new IllegalArgumentException(" Wage must be a value greater than zero");
        }
        this.wage = wage;
    }
    //get wage
    public double getWage() {
        return this.wage;
    }
    //set pieces
    public void setPieces(int pieces){
        if(pieces < 0)
            throw new IllegalArgumentException("Piece must be a value greater than or equal to zero");
        this.pieces = pieces;
    }
    //get pieces
    public int getPieces() {
        return this.pieces;
    }
    //calculate method earnings. overide abstract method earnings in Employee
    @Override
    public double earnings() {
        return wage * pieces;
    }
    
    //overide to string method of class earninigs
    @Override 
    public String toString() {
        return String.format("%s%nPieces: %d  Wage per Piece: %.1f%nEarnings: %s", super.toString(), 
                    getPieces(), getWage(),earnings());
    }
}
