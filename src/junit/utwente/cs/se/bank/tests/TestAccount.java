package junit.utwente.cs.se.bank.tests;

/**
 * Unit tests for the class Account
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
import junit.utwente.cs.se.bank.Account;
public class TestAccount extends junit.framework.TestCase {
	Account account1;
	Account account2;
/**
 * Setup new accounts
 * Creation date: (17-10-02 12:52:56)
 * @author Klaas van den Berg
 */
public void setUp() {
	account1 = new Account();
	account2 = new Account();
}
/**
 * Make balance of accounts zero
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void tearDown() {
	// example code
	account1.withdraw(account1.getBalance());
	account2.withdraw(account2.getBalance());
}
/**
 * Test case: check balance after deposit of amount on account 
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg 
 */
public void testDeposit() {
	int amount = 10;
	account1.deposit(amount);
	assertEquals("deposit", amount, account1.getBalance());
}
/**
 * Test case: check balance and uniqueness of new account
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testNewAccount() {
	assertNotNull("Account", account1);
	assertEquals("Balance of new account is zero.", 0, account1.getBalance());
	assertTrue("Balance of new account is zero.", 0 == account1.getBalance());
	assertNotSame("Two different accounts", account1, account2);
}
/**
 * Test case: check balance and uniqueness of new account
 * No use is made of setUp method
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testNewAccountNoSetUp() {
	// local variables are used for setting up two accounts
	Account account1 = new Account();
	assertNotNull("Account", account1);
	assertEquals("Balance of new account is zero.", 0, account1.getBalance());
	assertTrue("Balance of new account is zero.", 0 == account1.getBalance());
	Account account2 = new Account();
	assertNotSame("Two different accounts", account1, account2);
}
/**
 * Test case: check balance after withdrawal with sufficient balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testWithdraw() {
	int amount1 = 10;
	account1.deposit(amount1);
	assertEquals("Deposit", account1.getBalance(), amount1);
	int amount2 = 5;
	int withdrawn = account1.withdraw(amount2);
	assertEquals("Balance", amount1 - amount2 >= 0 ? amount1 - amount2 : 0, account1.getBalance());
	assertEquals("Withdrawn", amount1 - amount2 >= 0 ? amount2 : account1.getBalance(), withdrawn);
}
/**
 * Test case: check balance after withdrawal equal to balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testWithdrawBalance() {
	int amount1 = 10;
	account1.deposit(amount1);
	assertEquals("Deposit", amount1, account1.getBalance());
	int withdrawn = account1.withdraw(amount1);
	assertEquals("Balance", amount1, account1.getBalance());
	assertEquals("Withdrawn", 0, withdrawn);
}
/**
 * Test case: check balance after withdrawal exceeding balance
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testWithdrawTooMuch() {
	int amount1 = 10;
	account1.deposit(amount1);
	assertEquals("Deposit", account1.getBalance(), amount1);
	int amount2 = 15;
	int withdrawn = account1.withdraw(amount2);
	assertEquals("Balance", account1.getBalance(), amount1 - amount2 >= 0 ? amount1 - amount2 : 0);
	assertEquals("Withdrawn", withdrawn, amount1 - amount2 >= 0 ? amount2 : account1.getBalance());
}
}
