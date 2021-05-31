import java.util.*;

public class Product {
	private String name, category;
	private double priceMax,priceMin,price;
	private int quantity,id;
	private Brand brand;

	public Product(int id, String name, String category, double priceMin, double priceMax) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.priceMin = priceMin;
		this.priceMax = priceMax;
		this.quantity = 0;
		this.price = 0;
		this.brand = null;
	}

	/*public void addToStore(int quantity, double price) {
		this.quantity = quantity;
		this.price = price; //needs validation
	}*/

	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
		
	public double getPriceMin() {
		return priceMin;
	}	
	
	public void setPriceMin(double priceMin) {
		this.priceMin = priceMin;
	}
	
	public double getPriceMax() {
		return priceMax;
	}
	
	public void setPriceMax(double priceMax) {
		this.priceMax = priceMax;
	}
	
	public Store getPrice() {
		return price;
	}
	
	public void setPrice(Store store) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
