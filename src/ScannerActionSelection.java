
public class ScannerActionSelection {
	static final int MAX_OPTIONS = 4;
	int numberOfOptions = 0;
	ScannerOption[] scannerOptions;
	
	public ScannerActionSelection() {
		scannerOptions = new ScannerOption[MAX_OPTIONS];
		
		addOption("Scan One-Sided", "Landscape on 8x11 Inch Paper", 0.10);
		addOption("Scan Two-Sided", "Potrait on 8x11 Inch Paper", 0.20);
		addOption("Scan", "Save as PDF", 0.05);
		addOption("Scan", "Send as E-Mail", 0.05);
	}
	
	public void addOption (String name, String scannerAction, double price) {
		ScannerOption scannerOption = new ScannerOption(name, scannerAction, price);
		scannerOptions[numberOfOptions] = scannerOption;
		numberOfOptions = numberOfOptions + 1;
	}
	
	public ScannerOption[] getScannerOptions() {
		return scannerOptions;
	}
	
	public Iterator createIterator() {
		return new ScannerIterator(scannerOptions);
	}
}