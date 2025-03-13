//package dbvalidation;
//
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Logger;
//
//import org.junit.Assert;
//
//import com.mysql.cj.log.Log;
//
//public class QueryResult {
//
//	private static Statement statement = null;
//
//	// Declaration of the variables
//    static Connection con = null;
//    static String databasename = "";
//
//     static String url = "jdbc:mysql://localhost:3306/" +databasename;
//     static String username = "root";
//     static String password = "Sql@761645";
//     static String fname = null;
//     static String sqlquery = "SELECT * from chozhandb.employee";
//     static String expectedResult = "";
//
//
//
//	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//
//		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//		con = DriverManager.getConnection(url, username, password);
//		String sqlquery = "SELECT * from chozhandb.employee";
//
//
//
//	//	PreparedStatement ps = con.prepareStatement("SELECT * from chozhandb.employee");
//	//	 ResultSet rs = ps.executeQuery();
//
//
//		validateSQLQuery(con, sqlquery, expectedResult);
//
//
//
//	}
//
//
//
//
//
//public static boolean validateSQLQuery(Connection con,String sqlquery,String expectedResult) {
//
//	String actualResult = getQueryResultasString(con, sqlquery);
//
//	return false;
//
//
//}
//
//
//
//
//
//		 public static String getQueryResultasString (Connection con, String sqlquery) {
//
//
//			 boolean flag = false;
//			 ResultSet resultSet = null;
//			 String queryResult = "";
//			 resultSet = getResultSet(con,sqlquery);
//			 if(resultSet ==null) {
//				 return queryResult;
//
//			 }else {
//				 try {
//					 while (resultSet.next()) {
//						 queryResult = resultSet.getString(1);
//						 if(queryResult ==null) {
//							 queryResult ="";
//						 }
//					 }
//
//					 flag = true;
//				 }catch(SQLException var10) {
//					 System.out.println(var10.getMessage());
//				 }
//				 finally {
//					 closeConnection(con, resultSet);			 }
//			 }
//			 Assert.assertTrue(flag);
//
//
//			return queryResult;}
//
//		private static ResultSet getResultSet(Connection con, String sqlquery) {
//			ResultSet resultSet = null;
//			 boolean flag = false;
//
//			 try {
//				 statement = con.createStatement();
//				 resultSet = statement.executeQuery(sqlquery);
//
//
//				 if(resultSet !=null) {
//					 System.out.println("DB Result:Data found");
//					 System.out.println(resultSet);
//
//				 }else {
//
//					 System.out.println("DB Result:Data not found");
//				 }
//
//				 flag = true;
//			 }
//			catch (SQLException var9) {
//
//			}finally {
//				if (!flag) {
//					closeConnection(con,resultSet);
//
//				}
//			}
//			return null;
//		}
//
//		private static void closeConnection(Connection con, ResultSet resultSet) {
//
//
//		}
//
//
//
//
//
//
//
//
//
//}
