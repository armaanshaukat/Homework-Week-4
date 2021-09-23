
public class PrinterOptions {
	static final int MAX_OPTIONS = 9;
	int numberOfOptions = 0;
	PrinterOption[] printerOptions;
	
	public PrinterOptions() {
		printerOptions = new PrinterOption[MAX_OPTIONS];
		
		addOption("okay", "okay", 5.99);
	}
	
	public void addOption (String name, String printerType, double price) {
		PrinterOption printerOption = new PrinterOption(name, printerType, price);
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