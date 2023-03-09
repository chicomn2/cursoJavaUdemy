package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();
		System.out.print("Quantos produtos serão apresentados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.print("Comum, usado, ou importado (c/u/i):");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.println("Preço do produto");
			Double price = sc.nextDouble();
			if (c == 'u') {
				System.out.print("Data de fabricação (dd/mm/yyyy):");
				LocalDate date = LocalDate.parse(sc.next(), dtf1);
				products.add(new UsedProduct(name, price, date));
			} else if (c == 'i') {
				System.out.print("Taxa de importação: ");
				Double tax = sc.nextDouble();
				products.add(new ImportedProduct(name, price, tax));
			} else {
				products.add(new Product(name, price));
			}
		}
		System.out.println("Etiqueta de preço:");
		for(Product p: products) {
			System.out.println(p.priceTag());
		}

	}

}
