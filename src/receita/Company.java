package receita;

public class Company extends TaxPayer {
	protected Integer numberOfEmployees;
	
	public Company() {
		super();
		
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if(numberOfEmployees < 10 && numberOfEmployees > 0) {
			return getAnualIncome() * 0.16;
		}
		else {
			return getAnualIncome() * 0.14;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("The taxpyaer name is: " + "\n");
		sb.append(getName() + "\n");
		sb.append("The anual Income is: " +"\n");
		sb.append(getAnualIncome() + "\n");
		sb.append("The amount of workers is:" + "\n");
		sb.append(numberOfEmployees +"\n");
		sb.append("The total was :" + "\n");
		sb.append(tax() + "\n");
		
		return sb.toString();
		
		
	}

}
