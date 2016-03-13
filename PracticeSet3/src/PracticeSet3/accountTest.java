package PracticeSet3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class accountTest {
	Account lauren = new Account(1122,20000.0);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		lauren.setAnnualInterestRate(4.5);
		lauren.setDate(2016,3/9);
	}

	@After
	public void tearDown() throws Exception {
		Object lauren = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		lauren.withdraw(2500.00);
		assertEquals("$17500 expected",(long)lauren.getBalance(),(long)17500.00);
	}
	@Test
	public final void testDeposit() {
		lauren.deposit(3000.0);
		assertEquals("$23000 Expected",(long)lauren.getBalance(),(long)23000.00);
	}
	public final void testMonthlyInterest() {
		assertEquals(".375 Expected",lauren.getMonthlyInterestRate(),.375);
	}
}
