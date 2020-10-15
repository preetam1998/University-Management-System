package utilities2;

import java.sql.*;
public class Connection2 {
    
        static String DRIVER = "com.mysql.cj.jdbc.Driver";
        static String URL = "jdbc:mysql://localhost:3309/project15?useSSL=false";
        static String  USER = "root";
        static String PASS = "mysql";

	private  static Connection connection = null;
	private static Connection2  dbConnection= null;
	
	public static Connection getConnection() {
		try{
                    Class.forName(DRIVER);
                    connection  = DriverManager.getConnection(URL,USER,PASS);
                }catch(SQLException e) {
			System.out.println("Unable to load the driver." + e);
		}catch(ClassNotFoundException e) {
			System.out.println("Unable to load the driver." + e);
		}catch(Exception e) {
			System.out.println("Unable to load property file."+ e);
		}
		return connection;
		
	}
//	public static void main(String[] args) {
//		Connection2 db = new Connection2();
//		
//	}
}
