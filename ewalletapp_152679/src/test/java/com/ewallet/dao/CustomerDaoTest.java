package com.ewallet.dao;

import com.ewallet.bean.CustomerDetails;

import junit.framework.TestCase;

public class CustomerDaoTest extends TestCase {
	CustomerDao dao = new CustomerDao();
	CustomerDetails det = new CustomerDetails();
	public void testCreateAccount() {
		//fail("Not yet implemented");
		assertEquals(true,dao.createAccount(det));
		assertNotSame(false, dao.createAccount(det));
	}

	public void testDeposit() {
		//"Not yet fully  implemented"
		assertEquals(0, dao.deposit(1000));
	}

	public void testShowBalance() {
		//"Not yet fully  implemented"
		assertEquals(0, 0);
	}

	public void testFundTransfer() {
		//"Not yet fully  implemented"
		assertEquals(0, dao.fundTransfer());
	}

	public void testPrintTransactions() {
		//"Not yet fully  implemented"
		assertEquals(null, null);
	}

}
