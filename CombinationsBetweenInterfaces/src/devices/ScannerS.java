package devices;

public class ScannerS extends Device implements ScannerInterface {

	public ScannerS(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		return "Scanned doc";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc + ".");
	}

}
