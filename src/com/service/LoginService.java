package com.service;

import java.sql.SQLException;

import com.dao.LoginDao;
import com.dao.LoginDaoImpl;

public class LoginService {
	LoginDao ld=new LoginDaoImpl();
	public String checkLogin(String username, String password) throws SQLException {
		return ld.checkLogin(username,password);
	}
	
}
