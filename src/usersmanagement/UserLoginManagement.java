package usersmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.Connector;

public class UserLoginManagement {
	// get user password when login
		public String getPassword(String pwd) throws SQLException {
			String password ="";
			Connector mySqlCon = new Connector();
			Connection conn = mySqlCon.dbConnection();
			java.sql.Statement stmt = conn.createStatement();
			ResultSet userpassword = stmt.executeQuery("SELECT * FROM users WHERE password='"+pwd+"'");
			while(userpassword.next()) {
				password = userpassword.getString(6);
			}
			return password;
		}
		// get user email when login
		public String getUserEmail(String email) throws SQLException {
			String emailReturn = "";
			Connector mySqlCon = new Connector();
			Connection conn = mySqlCon.dbConnection();
			java.sql.Statement stmt = conn.createStatement();
			ResultSet userEmail = stmt.executeQuery("SELECT * FROM users WHERE email='"+email+"'");
			while(userEmail.next()) {
				emailReturn = userEmail.getString(3);
			}
			return emailReturn;
		}
		//	get user name when login
		public String getUserName(String username) throws SQLException {
			String userReturn = "";
			Connector mySqlCon = new Connector();
			Connection conn = mySqlCon.dbConnection();
			java.sql.Statement stmt = conn.createStatement();
			ResultSet user = stmt.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
			while(user.next()) {
				userReturn = user.getString(2);
			}
			return userReturn;
		}
}
