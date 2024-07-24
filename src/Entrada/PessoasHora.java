package Entrada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class PessoasHora {
	Boolean continuar = true;
	Scanner sc = new Scanner(System.in);
	
	//Criando os padrões de hora:
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	
	
	
	
	//Criando uma subclassse para colarmos dentro da Lista:
	class PessoasHoraInformacao {
		String NomePessoa;
		LocalDateTime Datahora;
		public PessoasHoraInformacao(String nomePessoa, LocalDateTime datahora) {
			this.NomePessoa = nomePessoa;
			this.Datahora = datahora;
		}
	}
	
	ArrayList<PessoasHoraInformacao> dados = new ArrayList<PessoasHoraInformacao>();
	
	
	
	
	//Criando o laço While para o cadastro:
	
	public void cadastro() {
		while(continuar) {
			System.out.println("Diga seu nome para cadastrarmos");
			String nomePessoa = sc.next();
			LocalDateTime data = LocalDateTime.now();
			dados.add(new PessoasHoraInformacao(nomePessoa, data));
			
			//Laço for para exibir quem entrou
			for(PessoasHoraInformacao i: dados) {
				System.out.println(i.NomePessoa + " entrou às " + i.Datahora.format(fmt));
				
			}
			
			//Pergunta para saber se mais pessoas vão ser inseridas
			System.out.println("Deseja inserir mais alguém? Sim/Não");
			String resposta = sc.next().toLowerCase();
			
			if(!(resposta.equals("sim"))) {
				System.out.println("Encerrando o sistema.... ");
				continuar = false;
				
			}
			
		}
		sc.close();
	}
	
	
	
	
	
	

}
