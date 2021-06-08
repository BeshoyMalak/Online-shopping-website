package onlineshopping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class BrandAdder {

	BrandAdder() {

	}

	public void addBrand(Brand brand) {
		//add brand to the system
		String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
		String username = "Bishoy";
		String password = "123456789"; //sql authentication
		try {
			Connection connection = DriverManager.getConnection(url, username, password); 
			System.out.println("connected\n");
			String sql = "Insert into brand(bname,category) Values(?,?)";
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setString(1,brand.getName());
			stat.setString(1,brand.getCategory());
			int rows = stat.executeUpdate();//note that here it gets no arguments
			if (rows>0)
			{
				System.out.println(rows + " added");
			}
			connection.close();
		}catch(Exception e) {System.out.println(e);}
	}

}