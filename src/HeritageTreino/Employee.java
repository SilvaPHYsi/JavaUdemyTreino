package HeritageTreino;

public class Employee {
	protected String name;
	protected Integer hours;
	protected Double valuePerHours;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	
	
	protected Double payment() {
		return hours * valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	
	
	public Double getPayment() {
		return payment();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Employee's name is: "+ name +"\n");
		sb.append("Employee will work for " + hours + " Hours" + "\n");
		sb.append("Employee will receive: " + getPayment() + "\n");
		sb.append("Thank you, have a good day" + "\n");
		sb.append("-".repeat(60) + "\n");
		
		return sb.toString();
		
	}
	

	
	
	
	

}
