package com.ewallet.service;

import junit.framework.TestCase;

public class DataValidateTest extends TestCase {
	DataValidate validate = new DataValidate();

	public void testValidateadhaarnumber() {
		//fail("Not yet implemented");
		assertEquals(true,validate.validateadhaarnumber("997209876543") );
		assertFalse(validate.validateadhaarnumber("9972"));
		assertTrue(validate.validateadhaarnumber("987654321147"));
		assertSame(true,validate.validateadhaarnumber("999876543213") );
		assertNotSame(false,validate.validateadhaarnumber("999876543213") );
	}

	public void testValidateemailid() {
		//fail("Not yet implemented");
		assertEquals(true,validate.validateemailid("google@gmail.com") );
		assertNotNull(validate.validateemailid("google@gmail.com"));
		assertTrue(validate.validateemailid("goo@gmail.com"));
		
	}

	public void testValidatephonenumber() {
		//fail("Not yet implemented");
		assertEquals(true,validate.validatephonenumber("9988776654"));
		assertFalse(validate.validatephonenumber("9333"));
		assertTrue(validate.validatephonenumber("7894561236"));
		assertNotNull(validate.validatephonenumber("9222415172"));
	}

	public void testValidateaccountnumber() {
	//	fail("Not yet implemented");
		assertNotNull(validate.validateaccountnumber("587632455678"));
		assertTrue(validate.validateaccountnumber("5673482945"));
	
	}

	public void testValidatecustomername() {
		//fail("Not yet implemented");
		
		assertNotNull(validate.validatecustomername("capge"));
		assertTrue(validate.validateaccountnumber("customer1"));
	}

}
