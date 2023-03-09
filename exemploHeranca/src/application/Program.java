package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 1000.0);

		// UPCASTING

		Account acc1 = bAcc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.);
		Account acc3 = new SavingsAccount(10047, "Anna", 1000.0, 0.01);

		// Downcasting

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3; // tentaiva de tornar uma SavingsAccount em uma
															// BusinessAccount
			acc5.loan(200);
			System.out.println("Loan!");
		}else {System.out.println("acc3 não é uma instancia de BusinessAccount");
		
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Balance Updated");
		}
		
		

	}
	
}
