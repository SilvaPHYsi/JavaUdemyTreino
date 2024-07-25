package udemy;

public class Departamento {
	double valorHora;
	String dep1 = "Vendas";
	String dep3 = "Almoxarifado";
	String dep2 = "Limpeza";
	String dep4 = "Administração";
	String dep5 = "TI";
	
	
	
	private Double valorDepartamentos(int dptResposta) {
		switch(dptResposta) {
		case 1:
		    valorHora =  5.5;
		    break;
		case 2:
		    valorHora = 6.75;
		    break;
		case 3:
			valorHora = 4.75;
			break;
		case 4:
			valorHora = 6.75;
			break;
		case 5:
			valorHora = 8.00;
			break;
		}
		return valorHora;
		
	}
	
	public Double  getvalorDepartamentos(int departamento) {
		return valorDepartamentos(departamento);
		
	}
	
}
