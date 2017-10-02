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
 * savings accounts. It inherits all of the instance fields of class account but
 * can not directly access them. It also inherits the operations provided for
 * class account. Additionally, it has operations to calculate and store accrued
 * interest.
 * 
 * Class Variables: NONE
 * 
 * Instance Variables: interestRate: Interest rate provided as a decimal. i.e.
 * .06 6%
 *******************************************************************************/
// TODO: Declare the class here

public class SavingsAccount extends Account {

	private double interestRate;

	/*******************************************************************************
	 * Constructor for class SavingsAccount. It creates a new instance of the
	 * account. To fill the private instance variables inherited from class
	 * Account, it invokes the constructor for class account through the call to
	 * Account's constructor via the "super" identifier. Super refers to a
	 * class's superclass.
	 *******************************************************************************/

	public SavingsAccount() {
		super();
		interestRate = 0;
	}

	public SavingsAccount(String lastName, String firstName, double balance, double interestRate) {
		super(lastName, firstName, balance);
		this.interestRate = interestRate;

	}

}
