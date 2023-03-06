package entities;

public class Employee {
	Integer id;
	String name;
	Double salary;
	public Employee(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id+", "+name+", "+salary;
	}
	
	public void increase (Double per) {
		this.salary += salary*(per/100);
	}
	

}
