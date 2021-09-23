
public class PrinterOption {
	String name;
	String printerType;
	double price;
	
	public PrinterOption(String name, String printerType, double price) {
		this.name = name;
		this.printerType = printerType;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrinterType() {
		return printerType;
	}
	
	public double getPrice() {
		return price;
	}
}