package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Bank;
import com.util.DBUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public String checkLogin(String username, String password) throws SQLException {
		Connection conn = DBUtil.getDBConn();
		List<Bank> l = new ArrayList<>();
		String sql ="select roles "
				+ "from customer "
				+ "where username = ? and password= ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		String role = null;
		ResultSet rst = pstmt.executeQuery();
		if (rst.next())
		{
			role=rst.getString("roles");
		}
		else
			throw new NullPointerException("Invalid Username/Password Given.\nplease check");
		System.out.println(role);
		return role;
	}

}
