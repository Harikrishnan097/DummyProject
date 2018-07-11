package com.ewallet.bean;

public class CustomerDetails {

	private String customer_name;
	private long phone_number;
	private long adhaar_number;
	private long account_no;
	private String email_id;
	private long transaction_id;
	private int customer_id;
	private double amount;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private double balance;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public long getAdhaar_number() {
		return adhaar_number;
	}
	public void setAdhaar_number(long adhaar_number) {
		this.adhaar_number = adhaar_number;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customer_name=" + customer_name + ", phone_number=" + phone_number + ", adhaar_number="
				+ adhaar_number + ", account_no=" + account_no + ", email_id=" + email_id + ", transaction_id="
				+ transaction_id + ", customer_id=" + customer_id + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
	
	
}
