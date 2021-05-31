public class Brand {
	private int id;
	private String name, category;
	
	public Brand(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
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
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	/*public ProductsList search(String name, String rule) {
		ProductsList matchingProducts = new ProductsList();
		for (Iterator i = Products.iterator(); i.hasNext(); ) {
			Product product = (Product) i.next();
			if (product.getName().matches(ruleName, rule))
				matchingProducts.add(product);
		}
		return matchingGames;
	}*/
}