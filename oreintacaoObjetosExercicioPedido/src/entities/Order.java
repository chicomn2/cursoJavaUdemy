package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double finalPrice = 0.0;
		for (OrderItem i : items) {
			finalPrice += i.subTotal();
		}
		return finalPrice;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Summary: \n");
		sb.append("Order Moment: " + dtf1.format(LocalDateTime.now()) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order Itens: \n");
		for (OrderItem i : items) {
			sb.append(i + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}

}
