package HeritageTreino;

public class OutsourcedEmployee extends Employee {
	
	public OutsourcedEmployee(String name, Integer hours, Double valor) {
		super(name, hours, valor);
	}

	protected Double additionalCharge() {
		super.getPayment();
		return super.getPayment() + (super.getPayment() * 1.1) ;
	}
	
	public Double getadditionalCharge() {
		return additionalCharge();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Employee's name is: "+ name +"\n");
		sb.append("Employee will work for " + hours + " Hours" + "\n");
		sb.append("Employee will receive: " + getadditionalCharge() + "\n");
		sb.append("Thank you, have a good day" + "\n");
		sb.append("-".repeat(60) + "\n");
		return sb.toString();
		
	}
	

}
