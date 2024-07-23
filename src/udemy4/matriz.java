package udemy4;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		int x;
		int y;
		System.out.println("Digite os número de linha e coluna(nessa ordem) da matriz. ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		//criação da matriz
		int [][] matriz = new int[x][y];
		System.out.println("Agora você precisará digitar os valores ");
		//laço for para adicionar os valores
		for(int i = 0; i<x; i++) {
			for(int j = 0; j<y; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//For para exibir valores
		
		 System.out.println("Valores da matriz:");
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	     //for para pegar o número de cima, do lado e de baixo
	        System.out.println("Digite um número da matriz:");
	        int numero = sc.nextInt();
	        
	        boolean found = false; // Variável para verificar se o número foi encontrado

	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                if (matriz[i][j] == numero) {
	                    found = true;
	                    System.out.println("Os números em volta desse são: ");
	                    if (i > 0) {
	                        System.out.println("Cima: " + matriz[i - 1][j]);
	                    }
	                    if (j < y - 1) {
	                        System.out.println("Direita: " + matriz[i][j + 1]);
	                    }
	                    if (j > 0) {
	                        System.out.println("Esquerda: " + matriz[i][j - 1]);
	                    }
	                    if (i < x - 1) {
	                        System.out.println("Baixo: " + matriz[i + 1][j]);
	                    }
	                    break; // Saia do laço interno quando o número for encontrado
	                }
	            }
	            if (found) break; // Saia do laço externo quando o número for encontrado
	        }
	        
	        if (!found) {
	            System.out.println("Número não encontrado na matriz.");
	        }
	        
	        sc.close();

	}

}
