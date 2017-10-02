/*
 * Group Members: Teresa Hoang, Ethan Meadows, Chelsea Randolph
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date: 10/2/2017
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 */

package exercise4;

/***************************************************************************
 * This class models a basic account that we might find at any financial
 * institution.
 * 
 * It defines basic operations that will apply to accounts of all types.
 * 
 * Class variables: nextAccountNumber: This holds the next available account
 * number to be assigned to a new account.
 * 
 * Instance Variables: accountNo: account number for the account. lastName:
 * Account holder's last name firstName: Account Holder's first name balance:
 * Account balance
 ****************************************************************************/
// TODO: Declare the class here

public abstract class Account {

	private static float nextAccountNumber = 1;

	private int accountNo;
	private String firstName;
	private String lastName;
	private double balance;

	public Account() {
		accountNo = 0;
		firstName = new String("unknown");
		lastName = new String("unknown");
		balance = 0;
	}

	public Account(String last, String first, double balance) {
		this.firstName = first;
		this.lastName = last;
		this.balance = balance;
	}
	
	
	public void deposit(double amount){
		// add to balance
		this.balance += amount;
	}
	
	public void withdrawal(double amount){
		balance -= amount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void print() {
		// this method prints out the data stored in all data members for a
		// specific instance

		System.out.println("Account number: " + accountNo + "belonging to "
				+ firstName + " " + lastName + " has a balance of " + balance);
	}

}
