package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter customer data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date: (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf1);
		Client client = new Client(clientName, email, date);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		System.out.print("How many items to this order: ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}

		System.out.println(order);

		sc.close();
	}

}
