
public class PrinterOption {
	String name;
	String printerAction;
	double price;
	
	public PrinterOption(String name, String printerAction, double price) {
		this.name = name;
		this.printerAction = printerAction;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrinterAction() {
		return printerAction;
	}
	
	public double getPrice() {
		return price;
	}
}