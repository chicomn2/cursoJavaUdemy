package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		Double manyDollars = sc.nextDouble();
		Double amount = CurrencyConverter.amount(dollarPrice, manyDollars);
		System.out.printf("Amount to be paid in Reais: %.2f",amount);
		
		sc.close();
	}

}
