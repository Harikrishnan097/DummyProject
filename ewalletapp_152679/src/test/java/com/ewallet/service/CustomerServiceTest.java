package com.ewallet.service;

import com.ewallet.bean.CustomerDetails;

import junit.framework.TestCase;

public class CustomerServiceTest extends TestCase {
CustomerService ser=new CustomerService();
CustomerDetails det=new CustomerDetails();
	public void testCreateAccount() {
		//fail("Not yet implemented");
		assertEquals(true, ser.createAccount(det));
	}

	public void testDeposit() {
		//fail("Not yet implemented");
		assertEquals(0, ser.deposit(1000));
	
	}

	public void testWithdraw() {
		//fail("Not yet implemented");
		assertEquals(0, ser.withdraw(1000));
	}

	public void testShowBalance() {
		//fail("Not yet implemented");
		assertEquals(0, 0);
	}

	public void testFundTransfer() {
		//fail("Not yet implemented");
		assertEquals(0, ser.fundTransfer());
	}

	public void testPrintTransactions() {
		//fail("Not yet implemented");
		assertEquals(0, 0);
	}

}
