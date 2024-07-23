package udemy3;

import java.util.Scanner;

public class alturasPessoas {

	public static void main(String[] args) {
		int n;
		double sum = 0;
		int pessoasde16 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas análises você deseja fazer: ");
		n =  sc.nextInt();
		//Vetores
		double [] alturas = new double[n];
		int [] idades = new int[n];
		String [] nomes = new String[n];
		
		if(n > 0) {
			// adcionando os valores nos vetores
			for(int i=0; i<n; i++) {
				System.out.println("Digite a altura da  " + (i + 1) + " pessoa");
				alturas[i] = sc.nextDouble();
				System.out.println("Digite a idade da  " + (i + 1) + " pessoa");
				idades[i] = sc.nextInt();
				System.out.println("Digite o nome da  " + (i + 1) + " pessoa");
				nomes[i] = sc.next();
			}
			//média das alturas
			for(int i=0; i<n; i++) {
				sum += alturas[i];
			}
			System.out.println("A altura média das pessoas é " + (sum/alturas.length));
			
			//porcentagem de pessoas menores que 16 anos
			for(int i=0; i<n; i++) {
				if(idades[i] < 16) {
					pessoasde16++;
					System.out.println(nomes[i] + " tem menos de 16 anos");
				}
			}
			 System.out.println("A porcentagem de pessoas com menos de 16 anos é: " + ((double) pessoasde16 / n) * 100 + "%");
		}
		
		
		
       sc.close();
	}

}
