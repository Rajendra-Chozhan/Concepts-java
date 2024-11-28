package dbvalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;







public class Test1 {

	
 // Declaration of the variables
    static Connection con = null;
    static String databasename = "";
    
     static String url = "jdbc:mysql://localhost:3306/" +databasename;
     static String username = "root";
     static String password = "Sql@761645";
     static String fname = null;
     private static Statement statement = null;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url, username, password);
		  
		PreparedStatement ps = con.prepareStatement("SELECT * from chozhandb.employee");
		 ResultSet rs = ps.executeQuery();
		 
             while (rs.next()) {               
                 
            	  fname = rs.getString(2);
                  System.out.println("The value from the table is : "+fname);
                  ResultSetMetaData metaData = rs.getMetaData();
                  int columns=metaData.getColumnCount();
                     for(int i=1;i<=columns;++i) {//this reads column by column
                    	    String result = "";
                     
                         result+="<"+metaData.getColumnName(i)+">";
                         result+=rs.getString(i);
                         result+="</"+metaData.getColumnName(i)+">\n";
                //         System.out.println(result);
                         
                         
                         PreparedStatement ps1 = con.prepareStatement("SELECT * from chozhandb.employee");
                         ResultSet rs1 = ps.executeQuery();
                         ResultSetMetaData rsmd = rs1.getMetaData();
                         int columnsNumber = rsmd.getColumnCount();
                         while (rs1.next()) {
                             for (int j = 1; j <= columnsNumber; j++) {
                                 if (j > 1) System.out.print(",  ");
                                 String columnValue = rs1.getString(j);
                                 System.out.print(columnValue + " " + rsmd.getColumnName(j));
                             }
                             System.out.println("");
                         }
                         
                         
                         
             }
         }
	}}
  
