package com.ewallet.bean;

import junit.framework.TestCase;

public class CustomerDetailsTest extends TestCase {
CustomerDetails det= new CustomerDetails();
	public void testGetCustomer_name() {
		//fail("Not yet implemented");
		assertNotSame(1, det.getCustomer_name() );
		assertEquals(null, det.getCustomer_name());
		assertNull(det.getCustomer_name());
		
	}

	public void testGetPhone_number() {
		//fail("Not yet implemented");
		assertNotSame("string", det.getPhone_number());
		assertEquals(0, det.getPhone_number());
		assertNotNull(det.getPhone_number());
	}

	public void testGetAdhaar_number() {
	//	fail("Not yet implemented");
		assertNotSame("string", det.getAdhaar_number());
		assertEquals(0, det.getAdhaar_number());
		assertNotNull(det.getAdhaar_number());
	}

	public void testGetAccount_no() {
		//fail("Not yet implemented");
		assertNotSame("ascc", det.getAccount_no());
		assertEquals(0, det.getAccount_no());
		assertNotNull(det.getAccount_no());
	}

	public void testGetEmail_id() {
		//fail("Not yet implemented");
		assertNotSame(1, det.getEmail_id());
		assertEquals(null, det.getEmail_id());
		assertNull(det.getEmail_id());
	}

	public void testGetCustomer_id() {
		//fail("Not yet implemented");
		assertNotSame("string", det.getCustomer_id());
		assertEquals(0, det.getCustomer_id());
		assertNotNull(det.getCustomer_id());
	}

	public void testGetBalance() {
		//fail("Not yet implemented");
		assertNotSame("string", det.getBalance());
		assertEquals(0.0, det.getBalance());
		assertNotNull(det.getBalance());
	}

}
