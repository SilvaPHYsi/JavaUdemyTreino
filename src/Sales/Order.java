package Sales;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {
    private Date moment;
    private static final SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy HH:mm");
    private OrderStatus status;
    ArrayList<OrderItem> items = new ArrayList<OrderItem>();
    private Client client;
    Scanner sc = new Scanner(System.in);

    // Methods
    public void addItem(OrderItem item) {
      items.add(item);
    }

    public void removeItem(OrderItem item) {
    	items.add(item);
      
    }

    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getSubTotal();
        }
        
        return total;
    }

    // Getters and setters
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	

	// Methods for interacting with items
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", calculateTotal()));
		return sb.toString();
	}


    
    
}
