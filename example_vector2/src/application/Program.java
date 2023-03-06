package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos serão cadastrados: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum+=vect[i].getPrice();
		}
		
		Double avg = sum/vect.length;
		
		System.out.printf("O preço médio dos produtos é %.2f", avg);

		sc.close();
	}

}
