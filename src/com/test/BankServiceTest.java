package com.test;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.model.Customer;
import com.service.BankService;

public class BankServiceTest {
	BankService bs=new BankService();
	
	@Test
	public void accountsListCheck()
	{
		try {
			bs.listAccounts();
	} catch (SQLException e) {
			Assert.assertEquals("Error in finding list of accounts in bank".toLowerCase(), e.getMessage());
		}
	}
	
//	@Test
//	public void geiId()
//	{
//		try
//		{
//			String fname="Maghalin", lname="Joseph",email="mag123@example.com",phone="246-568-1063",address="345 Sakura St",username="MagthalinJ",password="mag123",role="User";
//			Customer cus= new Customer(fname,lname,email,phone,address,username,password,role);
//			int cid= bs.createCustomerAccount(cus);
//			System.out.println(cid);
//		}catch (SQLException e) {
//			Assert.assertEquals("Error in Adding accounts in bank".toLowerCase(), e.getMessage());
//		}
//	}
	
}
