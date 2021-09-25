
public class PrinterActionSelection {
	static final int MAX_OPTIONS = 4;
	int numberOfOptions = 0;
	PrinterOption[] printerOptions;
	
	public PrinterActionSelection() {
		printerOptions = new PrinterOption[MAX_OPTIONS];
		
		addOption("Print", "Landscape on 8x11 Inch paper", 0.10);
		addOption("Print", "Potrait on 8x11 Inch paper", 0.10);
		addOption("Print", "Standard Envelope", 0.05);
		addOption("Print", "3D Model", 9.99); 
	}
	
	public void addOption (String name, String printerAction, double price) {
		PrinterOption printerOption = new PrinterOption(name, printerAction, price);
		printerOptions[numberOfOptions] = printerOption;
		numberOfOptions = numberOfOptions + 1;
	}
	
	public PrinterOption[] getPrinterOptions() {
		return printerOptions;
	}
	
	public Iterator createIterator() {
		return new PrinterIterator(printerOptions);
	}
}