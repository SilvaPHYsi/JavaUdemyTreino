package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	/*Integer n;
    	String SorN;
    	System.out.println("Quantas cadastros de funcionários irá ser feito? ");
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	
    	//Lista para armazenar os dados
    	ArrayList<String> listNome = new ArrayList<>();
    	ArrayList<Integer> listCadastro = new ArrayList<>();
    	ArrayList<Double> listSalario = new ArrayList<>();
    	
    	//Função de cadastro
    	if(n > 0) {
    		System.out.println("Digite o número do cadastro ");
    		int cadastro = sc.nextInt();
    		listCadastro.add(cadastro);
    		
    		System.out.println("Digite o nome ");
    		String nome = sc.next().toLowerCase();
    		listNome.add(nome);
    		
    		System.out.println("Digite o salário que a pessoa recebe atualmente ");
    		double salario = sc.nextDouble();
    		listSalario.add(salario);
    	}
    	else {
    		System.out.println("Digite algo válido, o programa terá de reiniciar ");
    	}
    	
    	
    	//Função de aumento de salário
    	
    	System.out.println("Você deseja realizar o aumento de algum salário? ");
    	System.out.println("Digite sim ou não");
    	SorN = sc.next().toLowerCase();
    	
    	while(SorN.equals("sim")) {
    		System.out.println("Digite o id do funcionário que terá o salário aumentado ");
    		int cadastro  = sc.nextInt();
    		System.out.println("Digite o nome do funcionário");
    		String nome = sc.next().toLowerCase();
    		System.out.println("Digite o salário do funcionário ");
    		double salario = sc.nextDouble();
    		if(listCadastro.contains(cadastro) && listNome.contains(nome) && listSalario.contains(salario)) {
    			System.out.println("O index do trabalhador é: "+ listSalario.indexOf(salario));
    			System.out.println("Digite a porcentagem a ser aumentada ");
    			double porcentagem = sc.nextDouble();
    			double total = salario +((salario*porcentagem)/100);
    			
    			System.out.println("Digite o index do salario antigo para adiconarmos o novo");
    			int x = sc.nextInt();
    			
    			listSalario.remove(x);
    			listSalario.add(x, total);

    		}
    		for(Integer k : listCadastro) {
    			System.out.println("Trabalhador de cadastro: " + k);
    		}
    		for(String k : listNome) {
    			System.out.println("Trabalhador de cadastro: " + k);
    		}
    		for(Double k : listSalario) {
    			System.out.println("Trabalhador de cadastro: " + k);
    		}
    		System.out.println("Deseja continuar? Digite sim ou não ");
    		SorN = sc.next().toLowerCase();
    		
    	}
    	
     sc.close();*/
    	
    	TreinoLocalDateTIme teste = new TreinoLocalDateTIme();
    	teste.hora();
    }
}
