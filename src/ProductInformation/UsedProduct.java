package ProductInformation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product name:\n");
        sb.append(name + "\n");
        sb.append("Manufacture date:\n");
        sb.append(sdf.format(manufactureDate) + "\n");
        sb.append("Product price:\n");
        sb.append(price + "\n");
        sb.append("--".repeat(60));
        return sb.toString();
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
