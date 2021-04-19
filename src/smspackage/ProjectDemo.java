package smspackage;

import java.sql.SQLException;

import dbconnection.Connector;
import usersmanagement.UserLogin;

public class ProjectDemo {

	public static void main(String[] args) throws SQLException {
		UserLogin userlogin = new UserLogin();
		userlogin.getUserLogin();
	}

}
