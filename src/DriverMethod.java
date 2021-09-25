
public class DriverMethod {

	public static void main(String[] args) {
		PrinterActionSelection printerActionSelection = new PrinterActionSelection();
		ScannerActionSelection scannerActionSelection = new ScannerActionSelection();
		
		Scheduler scheduler = new Scheduler(printerActionSelection, scannerActionSelection);

		scheduler.printJobs();
	}
}