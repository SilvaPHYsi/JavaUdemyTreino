package Sales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Hello, add some data ");
        System.out.println("Name: ");
        String namePerson = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth Date (dd/MM/yyyy): ");
        Date birthDate = sdf1.parse(sc.next());

        Client client = new Client(namePerson, email, birthDate);

        System.out.println("Enter order Data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
        System.out.println("How many items? ");
        int items = sc.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 0; i < items; i++) {
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.println("Quantity: ");
            
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productPrice, quantity, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
