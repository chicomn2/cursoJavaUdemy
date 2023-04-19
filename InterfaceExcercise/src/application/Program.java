package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalServices;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Contract Value: ");
		Double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, date, totalValue);

		System.out.print("How many installments: ");

		Integer n = sc.nextInt();
		ContractService contractService = new ContractService(new PayPalServices());
		contractService.processContract(contract, n);

		System.out.println("intallments: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);

		}

		sc.close();
	}

}
