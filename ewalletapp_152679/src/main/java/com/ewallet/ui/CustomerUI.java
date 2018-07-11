package com.ewallet.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import com.ewallet.bean.CustomerDetails;
import com.ewallet.service.CustomerService;
import com.ewallet.service.DataValidate;



public class CustomerUI {
	
	
	static boolean b;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	public static void main(String[] args) {
		
		int choice;
		Scanner in = new Scanner(System.in);
		int customer_id=0;
		double bal;
		Random rand = new Random();
		DataValidate validate = new DataValidate();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CustomerService service= new CustomerService();
		do {
		
		System.out.println(ANSI_BLUE+"-------------------------------------------"+ANSI_RESET);
		System.out.println(ANSI_BLUE+"     WELCOME TO THE EWALLET SYSTEM"+ANSI_RESET);
		System.out.println(ANSI_BLUE+"-------------------------------------------"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     1.CREATE AN ACCOUNT "+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     2.DEPOSIT "+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     3.WITHDRAW "+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     4.SHOW BALANCE "+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     5.FUND TRANSFER"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"     6.PRINT TRANSACTION "+ANSI_RESET);
		System.out.println(ANSI_BLUE+"-------------------------------------------"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"Enter Your Choice ...."+ANSI_RESET);
		choice = in.nextInt();
		switch(choice)
		{
		
		case 1:
			
			//service.createAccount();
			CustomerDetails details = new CustomerDetails();
			
			try {
				
				System.out.println("ENTER YOUR NAME * :");
				String customer_name;
				customer_name = br.readLine();
				System.out.println("ENTER YOUR ADHAAR NUMBER * :");
				String adhaar_number = br.readLine();
				System.out.println("ENTER YOUR EMAIL ID :");
				String email_id = br.readLine();
				System.out.println("ENTER YOUR PHONE NUMBER * :");
				String phone_number = br.readLine();
				System.out.println("ENTER YOUR ACCOUNT NUMBER *:");
				String account_no = br.readLine();
				System.out.println("ENTER THE PASSWORD");
				String password =br.readLine();
				customer_id = rand.nextInt(900000) + 100000;
				
				details.setCustomer_id(customer_id);
				details.setCustomer_name(customer_name);
				details.setAdhaar_number(Long.parseLong(adhaar_number));
				details.setEmail_id(email_id);
				details.setPhone_number(Long.parseLong(phone_number));
				details.setAccount_no(Long.parseLong(account_no));
				details.setCustomer_id(customer_id);
				details.setPassword(password);
				
				boolean isValidCustomername = validate.validatecustomername(customer_name);
				boolean isValidAdhaarnumber = validate.validateadhaarnumber(adhaar_number);
				boolean isValidPhonenumber = validate.validatephonenumber(phone_number);
				boolean isValidAccountnumber = validate.validateaccountnumber(account_no);
				boolean isValidEmailid=validate.validateemailid(email_id);

				if (isValidAccountnumber && isValidAdhaarnumber && isValidCustomername && isValidEmailid&&isValidPhonenumber) {

					
					 b=service.createAccount(details);

				} else {
					System.out.println("invalid data enter proper data");
				}

					 
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(b) {
				System.out.println(ANSI_BLUE+"ACCOUNT CREATED"+ANSI_RESET);
			System.out.println("YOUR CUSTOMER ID(USER ID) IS...."+ANSI_PURPLE+customer_id+ANSI_RESET);
			}
			break;
		case 2:
			 
			 System.out.println("ENTER THE AMOUNT TO DEPOSIT");
			 double amount = in.nextDouble();
			 service.deposit(amount);
			 
			
			
			break;
		case 3:
			System.out.println("ENTER THE AMOUNT TO DEPOSIT");
			  amount = in.nextDouble();
			 service.withdraw(amount);
			 break;
		case 4:
			
			service.showBalance();
			
			break;
		case 5:
			service.fundTransfer();
			break;
		case 6:
			break;
			
		}
		}while(choice!=6);
		
		
		
		
		
		
		
		
		
	}

}
