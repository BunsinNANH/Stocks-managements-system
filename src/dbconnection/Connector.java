package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	private String url = "jdbc:mysql://localhost:3306/sms_database";
	private String user = "root";
	private String password = "";
	Connection dbConnector = null;
	public Connection dbConnection(){
		try
		{
			// connect to mysql 
			dbConnector = (Connection) DriverManager.getConnection(url,user,password);
		}catch(Exception e){
			System.out.println(e);
		}  
		return dbConnector;
	}
	public Statement createStatement() throws SQLException {
		java.sql.Statement stmt = dbConnector.createStatement();
		return stmt;
	}
}
