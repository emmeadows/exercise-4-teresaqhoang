/*
 * Group Members: Teresa Hoang, Ethan Meadows, Chelsea Randolph
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date: 10/2/2017
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 */

package exercise4;

/*******************************************************************************
 * This class is a subclass of the class Account. It is intended to represent
 * checking accounts. It inherits all of the instance fields of class account
 * but can not directly access them. It also inherits the operations provided
 * for class account.
 * 
 * Class Variables: penalty: Amount of penalty to be applied to the account
 * should it fall below it's minimum balance.
 * 
 * Instance Variables: minBalance: Minimum balance required for the account.
 * minBalance can be a negative amount.
 *******************************************************************************/
// TODO: Declare the class here

public class CheckingAccount extends Account {
	
	private static final double PENALTY = 35.00;

	private double minBalance;

	/*******************************************************************************
	 * Constructor for class CheckingAccount. It creates a new instance of the
	 * account. To fill the private instance variables inherited from class
	 * Account, it invokes the constructor for class account through the call to
	 * Account's constructor via the "super" identifier. Super refers to a
	 * class's superclass.
	 *******************************************************************************/

	public CheckingAccount() {
		super();
		minBalance = 0;
	}

	public CheckingAccount(String lastName, String firstName, double balance, double minBalance) {
		super(lastName, firstName, balance);
		this.minBalance = minBalance;
	}
	
	public void withdrawal(double amount){
		super.getBalance();
	}

}
