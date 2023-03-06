package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		Double balance = 0.0;
		System.out.print("Is there an initial deposit? y/n: ");
		char response = sc.next().charAt(0);
		if(response=='y') {
			System.out.print("Enter inital deposit value:  ");
			balance = sc.nextDouble();
			client = new Client (accountNumber, accountHolder, balance);
		} else {
			client = new Client (accountNumber, accountHolder, balance);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.print(client);
		
		System.out.println();
		System.out.print("Enter a deposit value :");
		balance = sc.nextDouble();
		client.addBalance(balance);
		
		System.out.println();
		System.out.println("Updated account Data: ");
		System.out.print(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value :");
		balance = sc.nextDouble();
		client.withdrawBalance(balance);
		
		System.out.println();
		System.out.println("Updated account Data: ");
		System.out.print(client);
		
		sc.close();
	}

}
