package usersmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnection.Connector;

public class UserLogin {

	public void login() throws SQLException {
		Scanner input = new Scanner(System.in);
		Connector mySqlCon = new Connector();
		Connection conn = mySqlCon.dbConnection();
		String username = "";
		String password = "";
		int userPositionID = 0;
		String email = "";
		String pwdInput;
		String userNameInput;
		boolean status = false;
		if(mySqlCon != null) {
			UserLoginManagement  userLogin = new UserLoginManagement();
			java.sql.Statement stmt = conn.createStatement();
			java.sql.Statement update = conn.createStatement();
			do {
				System.out.println("\t=== LOGIN ===\n");
				System.out.print("Username: ");
				userNameInput = input.nextLine();
				System.out.print("Password: ");
				pwdInput = input.nextLine();
				username = userLogin.getUserName(userNameInput);
				password = userLogin.getPassword(pwdInput);
				email = userLogin.getUserEmail(userNameInput);
				if(username.equals(userNameInput) && password.equals(pwdInput)) {
					ResultSet user = stmt.executeQuery("SELECT * FROM users WHERE password='"+password+"' AND username='"+username+"'");
					String queryUpdate = "UPDATE users SET login_status='1' WHERE password='"+password+"' AND username='"+username+"'";
					update.executeUpdate(queryUpdate);
					while(user.next()) {
						userPositionID = user.getInt(10);
					}
					status = true;
					System.out.println("Login Successfully!");
				}else if(email.equals(userNameInput) && password.equals(pwdInput)) {
					ResultSet user = stmt.executeQuery("SELECT * FROM users WHERE password='"+password+"' AND email='"+email+"'");
					String queryUpdate = "UPDATE users SET login_status='1' WHERE password='"+password+"' AND email='"+email+"'";
					update.executeUpdate(queryUpdate);
					while(user.next()) {
						userPositionID = user.getInt(10);
					}
					status = true;
					System.out.println("Login Successfully!");
				}else if(email.equals(userNameInput) && !password.equals(pwdInput)) {
					status = false;
					System.out.println("Password Invalid!");
				}else if(username.equals(userNameInput) && !password.equals(pwdInput)) {
					status = false;
					System.out.println("Password Invalid!");
				}else if(!email.equals(userNameInput) && password.equals(pwdInput)) {
					status = false;
					System.out.println("Username Invalid!");
				}else if(!username.equals(userNameInput) && password.equals(pwdInput)) {
					status = false;
					System.out.println("Username Invalid!");
				}else{
					status = false;
					System.out.println("Username and Password Invalid!");
				}
				System.out.println();
			}while(status != true);
			UserMenu menu = new UserMenu();
			if(userPositionID == 2) {
				menu.adminMenu();
			}else {
				menu.managerMenu();
			}

		}else {
			System.out.println("Connection is fail!");
		}
	}
	
}
