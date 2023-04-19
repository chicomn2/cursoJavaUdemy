package devices;

public class Printer extends Device implements PrinterInterface {

	public Printer(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printed "+ doc+".");
	}

	@Override
	public void processDoc(String doc) {
		System.out.println(doc+" processesd by Printer.");
	}

}
