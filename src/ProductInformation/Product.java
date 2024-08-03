package ProductInformation;

public class Product {
	protected String name;
	protected Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product name:" + "\n");
		sb.append(name + "\n");
		sb.append("Product price: " + "\n");
		sb.append(price + "\n");
		sb.append("--".repeat(60));
		return sb.toString();
	}

	@Override
    public String toString() {
        return priceTag();
    }
	
	
	
	
	

}
