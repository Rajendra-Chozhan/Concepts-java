package dbvalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Test2 {

	
 // Declaration of the variables
    static Connection con = null;
    static String databasename = "";
    
     static String url = "jdbc:mysql://localhost:3306/" +databasename;
     static String username = "root";
     static String password = "Sql@761645";
     static String fname = null;
     static Statement stmt=null;
     static ResultSet rs=null;      
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url, username, password);
		
String sqlquery = ("SELECT * from chozhandb.employee");
		 stmt = con.createStatement();
		 rs = stmt.executeQuery(sqlquery); 
		 
		 ArrayList<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
		    // Process the result set - print Employees
		    while (rs.next())
		    { 
		    	EmployeeInfo currentEmp = new EmployeeInfo();

		        currentEmp.setEmpId(rs.getInt("EmpID"));
		        currentEmp.setFirstName(rs.getString("FirstName"));
		        currentEmp.setLastName(rs.getString("LastName"));
		        currentEmp.setAge(rs.getInt("EmpAge"));
		        currentEmp.setLoc(rs.getString("EmpLocation"));
		        employees.add(currentEmp);
		        System.out.println(employees);
		        
		        for(EmployeeInfo emp : employees)
		        {
		            System.out.println(emp.getEmpId() + " " +  emp.getFirstName() + " " + emp.getLastName() + " " + emp.getAge() + " "+ emp.getLoc() +" " +rs.getString("FirstName") );
		            System.out.println(rs.getRow());
		       }
		       
		      //  return;
		       
		    }       
		   } 
		   catch( SQLException se ) 
		   {
		      System.out.println ("SQLError: " + se.getMessage ()+ " code: " + se.getErrorCode ());
		   }
		   catch( Exception e )
		   {
		      System.out.println(e.getMessage());
		      e.printStackTrace(); 
		   }
		
		
         }
	}

