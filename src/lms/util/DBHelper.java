package lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class DBHelper {
	
	public static String DBDriver = "";
	public static String DBUrl = "";
	public static String DBUser = "";
	public static String DBPassword = "";
	
     Statement stmt;
	
	static
	{
		
	
		try {
			DBDriver = "com.mysql.jdbc.Driver";
			DBUrl = "jdbc:mysql://127.0.0.1:3306/lms?autoReconnect=true";
			DBUser = "root";
			DBPassword = "12345678";
			Class.forName(DBDriver);
					
		} 
		catch (Exception er) {
			System.out.println("ERROR DBHelper : static  [Driver loading Error] : " + er);
		}
        }
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
//		Class.forName("oracle.jdbc.driver.OracleDriver");   
//		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Testing","Concept");    
	
		 con = DriverManager.getConnection(DBUrl, DBUser,	DBPassword);

		 System.out.println("DB connected");

		}
		catch(Exception e)
		{
			System.out.println("**Error** : DBHelper:getConnection " +e.getMessage());
			
		}
		return con;
	}
	

}
