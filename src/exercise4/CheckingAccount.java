/*
 * Group Members:
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date:
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 * 
 */

package exercise4;

/*******************************************************************************

This class is a subclass of the class Account.  It is intended to represent
checking accounts, that have a minimum balance.  It inherits all of the instance
fields of class account, but can not directly access them.  It also inherits the
operations provided for class account.

Class Variables:
		penalty:  Amount of penalty to be applied to the account
			should it fall below it's minimum balance.

Instance Variables:
		minBalance:  Minimum balance required for the account.
		balanceFlag:  set to true if the balance drops below the
			minimum balance.
*******************************************************************************/
