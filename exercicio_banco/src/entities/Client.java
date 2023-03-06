package entities;

public class Client {
	private int accountNumber;
	private String accountHolder;
	private Double balance;
	
	private static final Double tax = 5.00;
	
	public Client () {
		
	}

	public Client(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	
	public Client(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public Double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account "+accountNumber+", Holder: "+accountHolder+", Balance: $ "+String.format("%.2f", balance);
	}
	
	public void addBalance(double deposit) {
		this.balance+=deposit;
	}
	
	public void withdrawBalance(double balance) {
		this.balance-=balance+tax;
	}
	
}
