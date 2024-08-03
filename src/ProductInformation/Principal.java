package ProductInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> product = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of products :");
		int n = sc.nextInt();

		// Laço for:
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the kind of product(P/PI/PU) :");
			System.out.println("P = Normal Product" + "\n" + "PI = Imported Product " + "\n" + "PU = Used Product");
			String type = sc.next().toUpperCase();
			System.out.println("Enter the product Name: ");
			String name = sc.next();
			System.out.println("Enter the product price: ");
			Double price = sc.nextDouble();
			if (type.equals("P")) {
				Product product1 = new Product(name, price);
				product.add(product1);
			} else if (type.equals("PI")) {
				System.out.println("Enter the custom fee: ");
				Double Fee = sc.nextDouble();
				ImportedProduct IP = new ImportedProduct(name, price, Fee);
				product.add(IP);
			    System.out.println("Enter the date (dd/MM/yyyy):");
			    sc.nextLine();  // Consome a nova linha pendente após a leitura do preço
			    String dateStr = sc.nextLine();  // Use nextLine() para ler a data
			    try {
			        Date date = sdf.parse(dateStr);
			        UsedProduct usedProduct = new UsedProduct(name, price, date);
			        product.add(usedProduct);
			    } catch (ParseException e) {
			        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
			    }
			}
		}
		
		// Exibir todos no console
		for(Product i : product) {
			System.out.println(i);
		}
	}
}
