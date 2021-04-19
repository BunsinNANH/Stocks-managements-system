package usersmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnection.Connector;

public class UserLogin {

	public void getUserLogin() throws SQLException {
		Scanner input = new Scanner(System.in);
		Connector mySqlCon = new Connector();
		Connection conn = mySqlCon.dbConnection();
		String username = "";
		String password = "";
		boolean status = false;
		if(mySqlCon != null) {
//			System.out.println("Connection Success!");
			java.sql.Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("select * from users");
//			while(result.next()) {
//				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+ result.getString(5));
//			}
//			do {
//				System.out.println("\t=== LOGIN ===\n");
//				System.out.print("Username: ");
//				username = input.nextLine();
//				System.out.print("Password: ");
//				password = input.nextLine();
//			}while(result.next() && !username.equals(result.getString(3)) && !password.equals(result.getString(5)));
//			System.out.println("Valid Username!");
			
		}else {
			System.out.println("Connection is fail!");
		}
	}
	
}
