package junit.utwente.cs.se.bank;

/**
 * An instance of this class has a balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public class Account {
	/**
 * The balance of the account with initial value
 * No negative balance is allowed
 */	
private int balance = 0;
/**
 * Adds an amount to the saldo
 * @param amount int the deposit
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void deposit(int amount) {
	balance = balance + amount;
}
/**
 * Returns the balance of the account
 * @return int the balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public int getBalance() {
	return balance;
}
/**
 * Decreases the balance with an amount providing a non-negative balance
 * @param amount int the amount to be withdrawn
 * @return int the actual amount withdrawn
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public int withdraw(int amount) {
	if (balance - amount < 0) {
		balance = 0;
		return balance;
	} else {
		balance = balance - amount;
		return amount;
	}
}
}
