package ProductInformation;

public class ImportedProduct extends Product {
	private Double customFee;
	

	public ImportedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price); // Call the superclass constructor with name and price
        this.customFee = customFee;
    }

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	private Double TotalPrice() {
		return (price + customFee);
	}
	
	public Double getTotalPrice() {
		return TotalPrice();
	}
	
    @Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product name:" + "\n");
		sb.append(name + "\n");
		sb.append("Product price: " + "\n");
		sb.append(String.format("%.2f", TotalPrice()) + "\n");
		sb.append("Custom Fee was: " + customFee + "\n");
		sb.append("--".repeat(60));
		return sb.toString();
	}
    public String toString() {
        return priceTag();
    }

}
