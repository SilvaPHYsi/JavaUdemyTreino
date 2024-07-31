package Sales;

public class Product {
	private String nameProduct;
	private Double Price;
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Product(String nameProduct, double price) {
		this.nameProduct = nameProduct;
		this.Price = price;
	}

}
