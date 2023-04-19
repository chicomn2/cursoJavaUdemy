package application;

import devices.ComboDevice;
import devices.Printer;
import devices.ScannerS;

public class Program {

	public static void main(String[] args) {
		Printer p = new Printer("1010");
		p.processDoc("\"My Letter\"");
		p.print("\"My Letter\"");
		System.out.println();
		
		
		ScannerS s = new ScannerS ("2020");
		s.processDoc("\"My e-mail\"");
		System.out.println("Scan result: \""+s.scan()+"\"");
		
		System.out.println();
		ComboDevice c = new ComboDevice("3030");
		c.processDoc("\"My dissertation\"");
		c.print("\"My letter\"");
		System.out.println("Scan result: \""+c.scan()+"\"");
		
		
		
		


	}

}
