package onlineshopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Buyer {

public int choosepr(User useer, Product prod) {
	//return product id in the targeted store
	String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
	String username = "Bishoy";
	String password = "123456789"; //sql authentication
	//return product id in the targeted store
	try {
		Connection connection = DriverManager.getConnection(url, username, password); 
		System.out.println("connected\n");
		String sql = "Select prId form store_prod where store_prod.sname = ? and store_prod.prsystemid = ?";
		PreparedStatement stat = connection.prepareStatement(sql);//edit according to what vedio says *_* *_*
		stat.setString(1,prod.getName());
		stat.setInt(2, prod.getID());
		ResultSet result = stat.executeQuery(sql);//note that here it gets no arguments
		while (result.next())
		{
			int product_store_id = result.getInt("prId");
			connection.close();
			return product_store_id;
		}
		//return product_store_id
		connection.close();
		return 0;
	}catch(Exception e) {System.out.println(e);
	return 0;
	}

}
	public boolean buy(User useer, Product prod,int quantity) {
		//buy a product
		//get adress from the user
		String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
		String username = "Bishoy";
		String password = "123456789"; //sql authentication
		try {
			
			Connection connection = DriverManager.getConnection(url, username, password); 
			System.out.println("connected\n");
			String sql = "Insert into buyed_pr(pr_id, buyer_email, quantity) Values(?,?,"
			+ "?)";
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setInt(1, this.choosepr(useer, prod));
			stat.setString(2, useer.getEmail());
			stat.setInt(3, quantity);
			int rows = stat.executeUpdate();//note that here it gets no arguments
			if (rows>0)
			{
				return true;
			}
			connection.close();
			return false;
		}catch(Exception e) {System.out.println(e);
		return false;
		}
	}
	
}