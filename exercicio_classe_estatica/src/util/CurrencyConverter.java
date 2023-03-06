package util;

public class CurrencyConverter {
	
	public static final double iof = 6;

	public static double amount(double dollarPrice, double manyDollars) {
		return (dollarPrice * manyDollars)*(1+iof/100);
	}
	
}
