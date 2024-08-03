package receita;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<TaxPayer> pay = new ArrayList<>();
		System.out.println("Enter how many Taxpayers: ");
		int n = sc.nextInt();
		
		//Laço for
		for(int i = 0; i < n; i++) {
			System.out.println("This a Individual person or Company (I/C) ?");
			String type = sc.next().toUpperCase();
			if(type.equals("I")) {
				System.out.println("Enter the taxpayer name: ");
				String name = sc.next();
				System.out.println("Enter the anual Income: ");
				double income = sc.nextDouble();
				System.out.println("There are health expenditures ? Put the amount:");
				double exp = sc.nextDouble(); 
				Individual indv = new Individual(name, income, exp);
				pay.add(indv);
			}
			else if( type.equals("C")){
				System.out.println("Enter the taxpayer name: ");
				String name = sc.next();
				System.out.println("Enter the anual Income: ");
				double income = sc.nextDouble();
				System.out.println("Enter how many Workers: ");
				int workers = sc.nextInt(); 
				Company cp = new Company(name, income, workers);
				pay.add(cp);
			}
			else {
				System.out.println("Something got wrong, try again.");
				continue;
			}
		}
		
		for(TaxPayer i: pay) {
			System.out.println(i);
		}

	}

}
