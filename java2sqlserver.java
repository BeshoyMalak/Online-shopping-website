/**
 * 
 */

/**
 * @author Bishoy Malak Fathy
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class java2sqlserver {
java2sqlserver(String url, String username, String password){
	//String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
	//String username = "Bishoy";
	//String password = "123456789";
	try {
	Connection connection = DriverManager.getConnection(url, username, password); 
	System.out.println("connected\n");
	}catch(Exception e) {System.out.println(e);}
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
		String username = "Bishoy";
		String password = "123456789";
		try {
		Connection connection = DriverManager.getConnection(url, username, password); 
		System.out.println("connected\n");
		String sql = "Insert into customer(cname,email,city,country) Values(?,?,"
				+ "?,?)";
		PreparedStatement stat = connection.prepareStatement(sql);
		stat.setString(1, "hi1");
		stat.setString(2, "hi2");
		stat.setString(3, "hi3");
		stat.setString(4, "hi4");
		int rows = stat.executeUpdate();//note that here it gets no arguments
		if (rows > 0)
		{
			System.out.println(rows + " added");
		}
		connection.close();
		}catch(Exception e) {System.out.println(e);}
	}

}
