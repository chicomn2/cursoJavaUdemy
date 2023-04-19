package devices;

public class ComboDevice extends Device implements PrinterInterface, ScannerInterface {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		}

	@Override
	public String scan() {
		return "Scanned by Combo Device";
	}

	@Override
	public void print(String doc) {
		System.out.println(doc+" printed by Combo Device.");
		}

	@Override
	public void processDoc(String doc) {
		System.out.println(doc+" processesd by Combo Device");
		}

}
