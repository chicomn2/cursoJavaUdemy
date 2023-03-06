package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary :");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee inc = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);  // list.stream() chama a lista inteira  .filter()realiza um filtro com os parametros x->x.getId()==id .findFirst().or Else(null) encontre a primeira instancia ou responda nulo
		if (inc == null) {
			System.out.println("This Id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double per = sc.nextDouble();
			inc.increase(per);
		}
		System.out.println();
		System.out.println("List of Employees:");
		for (Employee obj : list) {
			System.out.println(obj);

			sc.close();
		}
	}

}
