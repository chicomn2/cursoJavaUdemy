package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (1 + i) + ":");
			System.out.print("Outsourced (y/n): ");
			char empOut = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String empName = sc.nextLine();
			System.out.print("Hours: ");
			int empHours = sc.nextInt();
			System.out.print("Value per hour: ");
			double empValue = sc.nextDouble();
			if (empOut == 'y') {
				System.out.print("Aditional charge: ");
				Double aditionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(empName, empHours, empValue, aditionalCharge));
			} else {
				employees.add(new Employee(empName, empHours, empValue));
			}

		}
		System.out.println("Payments:");
		for (Employee e : employees) {
			System.out.println(e.getName()+" - $ "+String.format("%.2f", e.payment()));
		}

		sc.close();
	}

}
