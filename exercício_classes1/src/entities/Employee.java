package entities;

public class Employee {

	public String name;
	public Double grossSalary;
	public Double tax;

	public Double netSalary() {
		return grossSalary - tax;
	}

	public Double increaseSalary(Double percentage) {
		return this.grossSalary += (grossSalary * percentage / 100);
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
