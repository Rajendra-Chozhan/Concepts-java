package dbvalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
private static Statement statement = null;
	
	// Declaration of the variables
    static Connection con = null;
    static String databasename = "";
    
     static String url = "jdbc:mysql://localhost:3306/" +databasename;
     static String username = "root";
     static String password = "Sql@761645";
     static String fname = null;
     static String sqlquery = "SELECT * from chozhandb.employee";
     static String expectedResult = "";
  
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url, username, password);
		  
		PreparedStatement ps = con.prepareStatement("SELECT * from chozhandb.employee");
		 ResultSet rs = ps.executeQuery();
		 
		 
	
		 String queryResult = "";
		
		
		 
		
			 queryResult = rs.getString(1);
			
				 
				 System.out.println(queryResult);
		 
	}
}
