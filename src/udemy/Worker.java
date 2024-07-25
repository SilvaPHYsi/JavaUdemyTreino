package udemy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Worker {
	private String nome;
	private Double salarioBase;
	private int workerLevel;
	Boolean continuar = true;
	Departamento dpt = new Departamento();
	ArrayList<String> nomesFuncionarios = new ArrayList<>();
	ArrayList <Double> salarios = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getWorkerLevel() {
		return workerLevel;
	}

	public void setWorkerLevel(int workerLevel) {
		this.workerLevel = workerLevel;
	}

	// Funções
	private void addContrato() {
		while (continuar) {
			System.out.println("Alguém terá o contrato adicionado? (sim/nao)");
			String resposta = sc.next().toLowerCase();

			if (resposta.equals("sim")) {
				System.out.println("Qual o departamento desse novo funcionário? ");
				System.out.println("1 - Vendas");
				System.out.println("2 - Limpeza");
				System.out.println("3 - Almoxarifado");
				System.out.println("4 - Administração");
				System.out.println("5 - TI");
				Integer dptresposta = sc.nextInt();

				switch (dptresposta) {
				case 1:
					System.out.println("O departamento é " + dpt.dep1);
					salarioBase = dpt.getvalorDepartamentos(dptresposta);
					break;
				case 2:
					System.out.println("O departamento é " + dpt.dep2);
					salarioBase = dpt.getvalorDepartamentos(dptresposta);
					break;
				case 3:
					System.out.println("O departamento é " + dpt.dep3);
					salarioBase = dpt.getvalorDepartamentos(dptresposta);
					break;
				case 4:
					System.out.println("O departamento é " + dpt.dep4);
					salarioBase = dpt.getvalorDepartamentos(dptresposta);
					break;
				case 5:
					System.out.println("O departamento é " + dpt.dep5);
					salarioBase = dpt.getvalorDepartamentos(dptresposta);
					break;
				default:
					System.out.println("Opção inválida.");
					continue;
				}

				System.out.println("Digite o nome da pessoa: ");
				nome = sc.next().toLowerCase();
				nomesFuncionarios.add(nome);
				HourContract horaData;
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
				if (dptresposta == 1) {
					horaData = new HourContract(salarioBase, "08:00:00", "18:00:00");
					horaData.setHoraInicio(LocalTime.parse("08:00:00", fmt ));
					horaData.setHoraFim(LocalTime.parse("18:00:00", fmt));
					System.out.println("O trabalhador começa às " + horaData.getHoraInicio() +" e termina às " + horaData.getHoraFim() + " e ele deve receber " + horaData.getValor());
					salarios.add(horaData.getValor());
;				} else if (dptresposta == 3) {
					horaData = new HourContract(salarioBase, "07:00:00", "16:00:00");
					horaData.setHoraInicio(LocalTime.parse("07:00:00", fmt ));
					horaData.setHoraFim(LocalTime.parse("16:00:00", fmt));
					System.out.println("O trabalhador começa às " + horaData.getHoraInicio() +" e termina às " + horaData.getHoraFim() + " e ele deve receber " + horaData.getValor());
					salarios.add(horaData.getValor());
				} else {
					horaData = new HourContract(salarioBase, "08:00:00", "17:00:00");
					horaData.setHoraInicio(LocalTime.parse("08:00:00", fmt ));
					horaData.setHoraFim(LocalTime.parse("17:00:00", fmt));
					System.out.println("O trabalhador começa às " + horaData.getHoraInicio() +" e termina às " + horaData.getHoraFim() + " e ele deve receber " + horaData.getValor());
					salarios.add(horaData.getValor());
				}

				System.out.println("Deseja continuar? (sim/nao)");
				String pergunta = sc.next().toLowerCase();
				if (pergunta.equals("nao") || pergunta.equals("não")) {
					continuar = false;
				}
			} else {
				continuar = false;
			}

			for (int i = 0; i <  nomesFuncionarios.size(); i++) {
				System.out.println("O funcionário de nome " + nomesFuncionarios.get(i) + " deve receber: " + salarios.get(i) );
			}
		}
	}

	public void getContrato() {
		addContrato();
	}

	private void removerContrato() {
		System.out.println("Deseja remover um contrato? (sim/nao)");
		String resposta = sc.next().toLowerCase();
		if (resposta.equals("sim")) {
			System.out.println("Digite o nome da pessoa:");
			nome = sc.next().toLowerCase();
			if (nomesFuncionarios.remove(nome)) {
				LocalDateTime horadaSaida = LocalDateTime.now();
				DateTimeFormatter fmtSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				System.out.println("A pessoa de nome " + nome
						+ " foi removida e não receberá mais seu salário no próximo mês. Data e hora de saída: "
						+ horadaSaida.format(fmtSaida));
			} else {
				System.out.println("Funcionário não encontrado.");
			}
		}
	}

	public void getremoverContrato() {
		removerContrato();
	}
}
