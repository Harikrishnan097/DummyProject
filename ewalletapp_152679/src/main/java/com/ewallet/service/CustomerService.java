package com.ewallet.service;

import java.util.ArrayList;
import java.util.List;

import com.ewallet.bean.CustomerDetails;
import com.ewallet.dao.CustomerDao;

public class CustomerService {
	CustomerDao dao = new CustomerDao();
	public boolean createAccount(CustomerDetails details) {
		
		return dao.createAccount(details);
	 }
	public int deposit(double amount) {
		return dao.deposit( amount);
		
	}
	public int withdraw(double amount) {
		return dao.withdraw(amount);
	}
	public List showBalance() {
		return dao.showBalance();
	}

	public int fundTransfer() {
		return dao.fundTransfer();
	}
	List printTransactions(CustomerDetails details) {
		return null;
	}
	
}
