
public class ScannerOption {
	String name;
	String scannerAction;
	double price;
	
	public ScannerOption(String name, String scannerAction, double price) {
		this.name = name;
		this.scannerAction = scannerAction;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getScannerAction() {
		return scannerAction;
	}
	
	public double getPrice() {
		return price;
	}
}