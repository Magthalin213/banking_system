package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.InsufficientFundException;
import com.exception.InvalidAccountException;
import com.service.LoginService;

public class LoginController {
	public static void main(String[] args) throws SQLException, InvalidAccountException, InsufficientFundException {
		Scanner sc = new Scanner(System.in);
		LoginService ls=new LoginService();
		while(true)
		{
			System.out.println("********************Login********************");
			System.out.println("Enter your Username: ");
			String username=sc.nextLine();
			System.out.println("Enter your Password: ");
			String password=sc.nextLine();
			
			String role =ls.checkLogin(username,password);
			if(role.equals("Admin"))
				BankController.main(args);
			else if(role.equals("User"))
				CustomerController.main(args);
			else
				System.out.println("Invalid input");
			
		}
	}
}
