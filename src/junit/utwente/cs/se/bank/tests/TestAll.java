package junit.utwente.cs.se.bank.tests;

/**
 * Main class for executing all test classes listed in the method suite
 * Creation date: (17-10-02 13:01:22)
 * @author Klaas van den Berg
 */
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
public class TestAll extends TestSuite {
/**
 * Main method for executing all test classes listed in the method suite of this class
 * @param args java.lang.String[]
 */
public static void main(String[] args) {
	// the TestRunner can also be selected from the package junit.awtui or junit.textui
	TestRunner.run(TestAll.class);
}
/**
 * Test suite with all classes to be tested
 * These classes could be located in other packages
 * @return junit.framework.Test
 */
public static Test suite() {
	TestSuite suite = new TestSuite();
	suite.addTestSuite(TestAccount.class);
	suite.addTestSuite(TestBank.class);
	return suite;
}
}
