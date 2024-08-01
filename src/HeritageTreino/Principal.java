package HeritageTreino;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários deseja inserir? ");
		
		ArrayList<Employee> Employee = new ArrayList<>();
		ArrayList<OutsourcedEmployee> outsourced = new ArrayList<>();
		
		int n = sc.nextInt();
		
		
		
		for(int i = 0; i<n ; i++) {
			System.out.println("Enter the employee name: ");
			String name = sc.next();
			System.out.println("Enter the employee's hours: ");
			Integer hours = sc.nextInt();			
			System.out.println("Enter the employee's value per hours: ");
			Double valor = sc.nextDouble();
			System.out.println("This is a normal employee or outsourced employee (E/OE):");
			String check = sc.next().toLowerCase();
			if(check.equals("e") || check.equals("normal employee")) {
				Employee employee = new Employee(name, hours , valor);
				Employee.add(employee);
			}
			else if(check.equals("oe") || check.equals("outsourced employee")) {
				OutsourcedEmployee outsourced1 = new OutsourcedEmployee(name, hours , valor);
				outsourced.add(outsourced1);
			}
			
			
		}
		
		for(Employee j : Employee) {
			System.out.println(j);
		}
		
		for(OutsourcedEmployee k : outsourced) {
			System.out.println(k);
		}
		sc.close();

	}

}
