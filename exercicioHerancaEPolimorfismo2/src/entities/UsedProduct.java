package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate manufacturedDate;

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String priceTag() {
		return name+" (usado) $ "+String.format("%.2f", price)+" (Data de fabricação: "+dtf1.format(manufacturedDate)+")";
	}

}
