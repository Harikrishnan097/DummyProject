package com.ewallet.service;

import java.util.regex.Pattern;

public class DataValidate {
public boolean validateadhaarnumber(String adhaar_number) {
		
		if((adhaar_number.length()==12))
		{
			
			return true;
			
		}
		
		else {
			System.out.println("no ad");
			return false;
			
		}
	}
public boolean validateemailid (String email_id) {
	
	if(email_id.endsWith(".com"))
	{
		
		return true;
	}
	
	else {
		System.out.println("no em");
		return false;
		
	}
}
public boolean validatephonenumber(String phone_number) {
	
	if(phone_number.length()==10)
	{
		
		return true;
	}
	
	else {
		System.out.println("no ph");
		return false;
	}}
	public boolean validateaccountnumber(String account_no) {
		
		if(!(account_no.isEmpty()))
		{
			
			return true;
		}
		
		else {
			System.out.println("no acc");
			return false;
		}
	}


public boolean validatecustomername(String customer_name) {
		
		if(!(customer_name.isEmpty()))
		{
			
			return true;
		}
		
		else {
			System.out.println("no name");
			return false;
		}
	}



}




	


