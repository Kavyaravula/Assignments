package MyAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseTest {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.jdbc.Driver");
	     System.out.println("Driver Loaded");
	     String url = "jdbc:mysql://localhost:3307/selenium";
	    Connection con= DriverManager.getConnection(url,"root","Hanuman@01");
	    System.out.println("Connection crteated");
	}

}
 