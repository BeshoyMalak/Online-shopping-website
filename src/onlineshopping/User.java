package onlineshopping;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class User {
	private String name, password, email;
	private int id;

	public User(int id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
	public boolean login(String username, String inpass) {
		//return product id in the targeted store
		String url = "jdbc:sqlserver://LAPTOP-1GASM60P\\SQLEXPRESS;databaseName = online_shopping";
		String susername = "Bishoy";
		String spassword = "123456789"; //sql authentication
		try {
			Connection connection = DriverManager.getConnection(url, susername, spassword); 
			System.out.println("connected\n");
			String sql = "Select pass form customer where customer.email = ?";
			PreparedStatement stat = connection.prepareStatement(sql);//edit according to what vedio says *_* *_*
			stat.setString(1, username);
			ResultSet results = stat.executeQuery(sql);//note that here it gets no arguments
			if (inpass == results.getString("pass")) {
				connection.close();
				return true;
			}
			connection.close();
			return false;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	/*protected Product selectProduct(ProductsList products) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite the name of your desired product: ");
		String name = sc.nextLine();
		while (products.getProduct(name) == null ) {
			System.out.println("\nThere is no Product with that name. Please, type again the name of your desired product: ");
			name = sc.nextLine();
		}
		return products.getProduct(name);
	}*/
}