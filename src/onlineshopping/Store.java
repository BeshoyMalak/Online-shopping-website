package onlineshopping;

import java.util.*;

public class Store {
	private String name, location, type;
	private int id;
	private List products;

	public Store(int id, String name, String location, String type) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.products = new LinkedList<Product>();
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner=storeOwner;
	}
	public LinkedList getProductsList() {
		return products;
	}

	public void setProductsList(LinkedList products){
		this.products = products;
	}

	public Product getProduct(String name) {
		for (Iterator i = products.iterator(); i.hasNext(); ) {
			Product product = (Product) i.next();
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
}