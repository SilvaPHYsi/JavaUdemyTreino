package udemy2;

import java.util.Scanner;

public class exInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você deseja armazenar?");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		if(n <= 0) {
			System.out.println("Não há como armazenar essa quantidade ");
		}
		else {
			for(int i = 0; i < n; i ++) {
				System.out.println("Digite o número desejado");
				numbers[i] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++) {
			if(numbers[i] < 0) {
				System.out.println("Você digitou o número negativo: " + numbers[i]);
			}
		}
		sc.close();

	}

}
