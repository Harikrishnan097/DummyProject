package com.ewallet.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ewallet.bean.CustomerDetails;

public class CustomerDao {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
		// TODO Auto-generated constructor stub
		double balance;
		Scanner in = new Scanner(System.in);
		List<CustomerDetails> list = new ArrayList<CustomerDetails>();
		Map<Integer,CustomerDetails>map= new HashMap<Integer,CustomerDetails>();
	public  boolean createAccount(CustomerDetails details) {
		 
		 
		
		boolean flag;
		flag=list.add(details);
		
		 return flag;
		 
	 }

public int deposit(double amount) {
	System.out.println(ANSI_PURPLE+"ENTER THE CUSTOMER ID..."+ANSI_RESET);
	int customer_id=in.nextInt();
	int flag=1,finish=0;
	 System.out.println("ENTER YOUR PASSWORD");
	 String password=in.next();
	
	 
	for(CustomerDetails details:list) {
		if(details.getCustomer_id()==customer_id) {
			
			if(password.equals(details.getPassword())) {
				
				balance=details.getBalance()+amount;
				details.setBalance(balance);
				finish=1;
			}
			else {
				flag=0;
				break;
			}
			
		
		}
	}
	if(flag==0) {System.out.println("Enter the correct  password");}
	if(finish==1) {
		System.out.println(" Sucessfully amount deposited....");
	}
	System.out.println("YOUR BALANCE IS"+ANSI_PURPLE+balance+ANSI_RESET);
	for(CustomerDetails details:list) {
		System.out.println(details);
	}
	
	return 0;
		
	}

public int withdraw(double amount) {
	
	System.out.println(ANSI_PURPLE+"ENTER THE CUSTOMER ID..."+ANSI_RESET);
	int customer_id=in.nextInt();
	int flag=1,finish=0;
	 System.out.println("ENTER YOUR PASSWORD");
	 String password=in.next();
	
	 
	for(CustomerDetails details:list) {
		if(details.getCustomer_id()==customer_id) {
			
			if(password.equals(details.getPassword())) {
				
				balance=details.getBalance()-amount;
				details.setBalance(balance);
				finish=1;
			}
			else {
				flag=0;
				break;
			}
			
		
		}
	}
	if(flag==0) {System.out.println("Enter the correct  password");}
	if(finish==1) {
		System.out.println(" Sucessfully amount withdrawn....");
	}
	System.out.println("YOUR BALANCE IS"+ANSI_PURPLE+balance+ANSI_RESET);
	for(CustomerDetails details:list) {
		System.out.println(details);
	}
	
	
	
	return 0;
}

public List showBalance() {
	
	
	System.out.println(ANSI_PURPLE+"ENTER THE CUSTOMER ID..."+ANSI_RESET);
	int customer_id=in.nextInt();
	int flag=1,finish=0;
	 System.out.println("ENTER YOUR PASSWORD");
	 String password=in.next();
	
	 
	for(CustomerDetails details:list) {
		if(details.getCustomer_id()==customer_id) {
			
			if(password.equals(details.getPassword())) {
				
				System.out.println("YOUR BALANCE IN ACCOUNT IS  "+details.getBalance());
				finish=1;
			}
			else {
				flag=0;
				break;
			}
			
		
		}
	}
	if(flag==0) {System.out.println("Enter the correct  password");}
	
	
	return list;
	
}

public int fundTransfer() {
	int flag=0,finish=1;
	System.out.println("ENTER YOUR CUSTOMER ID");
	int customer_id=in.nextInt();
	System.out.println("ENTER THE RECEIVERS CUSTOMER ID");
	int  customer_idreceive =in.nextInt();
	System.out.println("ENTER THE AMOUNT TO TRANSFER");
	double amount= in.nextDouble();
	System.out.println("ENTER YOUR PASSWORD TO TRANSFER");
	String password=in.next();
	for(CustomerDetails details:list) {
			if(details.getCustomer_id()==customer_id) {
			
			if(password.equals(details.getPassword())) {
				
				balance=details.getBalance()-amount;
				
				details.setBalance(balance);
			}
			}
			}
				
	for(CustomerDetails details:list) {
		if(details.getCustomer_id()==customer_idreceive) {
		
		if(password.equals(details.getPassword())) {
			System.out.println("in");
			balance=details.getBalance()-amount;
			details.setBalance(balance);
			System.out.println(balance);
		}
		}
		}	

	
	//if(flag==1) {System.out.println("the amount is depited from your account");}
	//if(finish==1) {System.out.println("the amount is credited to receiver");}
	
	return 0;
	}
List printTransactions(CustomerDetails details) {
	return null;
}






}
