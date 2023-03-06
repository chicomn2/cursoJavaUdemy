package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer product data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity: ");

		Product product = new Product(name, price);
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.print("Enter the nuber of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addproducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.print("Enter the nuber of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}
