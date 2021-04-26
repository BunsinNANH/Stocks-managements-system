package usersmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.Connector;

public class UserLogout {
	public void logout() throws SQLException {
		UserLogin loginPage = new UserLogin();
//		UserLoginManagement userLogined = new UserLoginManagement();
//		String username = userLogined.getUserName();
//		String email = userLogined.getUserEmail();
//		String pwd = userLogined.getPassword();
		Connector mySqlCon = new Connector();
		Connection conn = mySqlCon.dbConnection();
		if(mySqlCon != null) {
//			java.sql.Statement stmt = conn.createStatement();
//			String getUserLogin = "SELECT * FROM users WHERE username='"+username+"' AND password='"+pwd+"'"
//					+ "OR email='"+email+"' AND login_status='1'";
//			ResultSet user = stmt.executeQuery(getUserLogin);
//			while(user.next()) {
//				System.out.println(user.getString(2));
//			}
			java.sql.Statement stmtLogout = conn.createStatement();
			String logout= "UPDATE users SET login_status='0'";
			stmtLogout.executeUpdate(logout);
			System.out.println("You have been logout successfully!");
			loginPage.login();
		}
	}
}
