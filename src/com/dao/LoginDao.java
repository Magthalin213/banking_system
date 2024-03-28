package com.dao;

import java.sql.SQLException;

public interface LoginDao {

	public String checkLogin(String username, String password) throws SQLException;
}
