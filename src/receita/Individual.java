package receita;

public class Individual extends TaxPayer {
	protected Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		if(getAnualIncome() < 20000 && getAnualIncome() > 0 ) {
			return  getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else{
			return  getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("The taxpyaer name is: " + "\n");
		sb.append(getName() + "\n");
		sb.append("The anual Income is: " +"\n");
		sb.append(getAnualIncome() + "\n");
		sb.append("The health expenditures was :" + "\n");
		sb.append(healthExpenditures + "\n");
		sb.append("The total was :" + "\n");
		sb.append(tax() + "\n");
		
		return sb.toString();
		
		
	}

}
