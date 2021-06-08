package onlineshopping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ProductAdder{

	public void addProduct(Product product) {
		//add product to the system
		String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
		String username = "Bishoy";
		String password = "123456789";
		try {
			Connection connection = DriverManager.getConnection(url, username, password); 
			System.out.println("connected\n");
			String sql = "Insert into product(pname,brand,hprice,lprice,ptype,extra,exploration) Values(?,?,"
			+ "?,?,?,'',0)";
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setString(1, product.getName());
			stat.setString(2, product.getBrand().getName());
			stat.setDouble(3, product.getPriceMax());
			stat.setDouble(4, product.getPriceMin());
			stat.setString(5, product.getCategory());
			int rows = stat.executeUpdate();//note that here it gets no arguments
			if (rows>0)
			{
				System.out.println(rows + " added");
			}
			connection.close();
		}catch(Exception e) {System.out.println(e);}
	}

}