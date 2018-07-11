package com.ewallet.service;

import java.util.List;

import com.ewallet.bean.CustomerDetails;

public interface ICustomerService {
	 boolean createAccount(CustomerDetails details);
	 int deposit( double amount);
	 List showBalance();
	   int fundTransfer();
	   int withdraw(double amount);
	   List printTransactions(CustomerDetails details);
}
