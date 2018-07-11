package com.ewallet.dao;

import java.util.List;

import com.ewallet.bean.CustomerDetails;

public interface ICustomerDao {
   boolean createAccount(CustomerDetails details);
   int deposit(double amount);
   int withdraw(double amount);
   List showBalance();
   int fundTransfer();
   List printTransactions(CustomerDetails details);
}
