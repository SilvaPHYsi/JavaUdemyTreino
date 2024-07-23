package udemy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TreinoLocalDateTIme {
	boolean continuar = true;
	String nomePessoa;
	ArrayList<String> nomes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	public void hora() {
		while(continuar) {
			LocalDateTime data = LocalDateTime.now();
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			System.out.println("Digite seu nome para referenciarmos no banco de dados");
			nomePessoa = sc.next();
			nomes.add(nomePessoa);
			for(String i: nomes) {
				System.out.println(i + " entrou na data " + data.format(fmt1)+ "segundos");
			}
			System.out.println("Deseja continuar? Sim/Não");
			String x = sc.next().toLowerCase();
			if(x.equals("não") || x.equals("nao")) {
				continuar = false;
				System.out.println("Fechando o programa...");
			}
		}
		
	}
	
	
}
