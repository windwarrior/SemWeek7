package junit.utwente.cs.se.bank.tests;

/**
 * Unit tests for the class Bank
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
import junit.utwente.cs.se.bank.Bank;
import junit.utwente.cs.se.bank.Account;
import junit.framework.TestCase;
public class TestBank extends TestCase {
/**
 * Test case: check balance of bank with more accounts
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
public void testBalance() {
	Bank bank = new Bank();
	Account account1 = new Account();
	bank.add(account1);
	Account account2 = new Account();
	bank.add(account2);
	int amount1 = 10;
	account1.deposit(amount1);
	int amount2 = 20;
	account2.deposit(amount2);
	assertEquals("bank balance", amount1 + amount2, bank.getBalance());
}
}
