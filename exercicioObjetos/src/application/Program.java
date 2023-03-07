package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Enter dapartment name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker's data");
		System.out.print("Name: ");
		String workersName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workersName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));
		System.out.print("How many contracts to this worker: ");
		int contractNum = sc.nextInt();
		for (int i = 0; i < contractNum; i++) {
			System.out.println("Enter contract #" + (1 + i) + " data: ");
			System.out.print("Date (DD/MM/YYYY) : ");
			String d = sc.next();
			DateTimeFormatter dtm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(d, dtm1);
			System.out.print("Value per Hour :");
			Double value = sc.nextDouble();
			System.out.print("Duration : ");
			int hours = sc.nextInt();
			HourContract hourContract = new HourContract(date, value, hours);
			worker.addContract(hourContract);
			}
		System.out.println();
		System.out.println("Enther montha and Year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getDepartmentName());
		System.out.println("Income for: "+monthYear+": "+String.format("%.2f", worker.income(year, month)));
		sc.close();

	}

}
