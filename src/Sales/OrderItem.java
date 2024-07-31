package Sales;

public class OrderItem {
    private Integer quantity;
    private Double priceF;
    private Product product;

    public OrderItem(Double price, Integer quantity, Product product) {
        this.priceF = price;
        this.quantity = quantity;
        this.product = product;
    }
    

    public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriceF() {
        return priceF;
    }

    public void setPrice(Double price) {
        this.priceF = price;
    }

    
    //Função do subTotal
    private Double subTotal() {
        return priceF * quantity;
    }

    public Double getSubTotal() {
        return subTotal();
    }
    
    @Override
	public String toString() {
		return product.getNameProduct()
				+ ", $" 
				+ String.format("%.2f", priceF) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
    
}
