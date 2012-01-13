package junit.utwente.cs.se.bank;

/**
 * An instance of this class has zero or more accounts
 * The balance is the sum of the balance's from these accounts
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
import java.util.Vector;
import java.util.Enumeration;
public class Bank {
	// accounts of bank with initial value
	private Vector accounts = new Vector();
	// balance of bank with initial value
	private int balance = -1;
/**
 * Adds an account to the bank
 * @param a junit.utwente.cs.se.bank.Account
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void add(Account account) {
	accounts.add(account);
}
/**
 * Returns the balance of the bank
 * @return int the balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public int getBalance() {
	Enumeration allaccounts = accounts.elements();
	while (allaccounts.hasMoreElements()) {
		balance = balance + ((Account) allaccounts.nextElement()).getBalance();
	}
	balance = balance + ((Account) allaccounts.nextElement()).getBalance();
	return balance;
}
}
