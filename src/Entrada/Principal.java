package Entrada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bem vindo! ");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Deseja cadastrar alguém? Sim/Não");
		String resposta1 = sc1.next().toLowerCase();
		
		
		
		if(resposta1.equals("sim")) {
			PessoasHora novocadastro = new PessoasHora();
			novocadastro.cadastro();
		}
		else {
			System.out.println("Adeus...");
		}
		
		sc1.close();

	}

}
