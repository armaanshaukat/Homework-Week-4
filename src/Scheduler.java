
public class Scheduler {
	PrinterActionSelection printerActionSelection;
	ScannerActionSelection scannerActionSelection;
	
	public Scheduler(PrinterActionSelection printerActionSelection, ScannerActionSelection scannerActionSelection) {
		this.printerActionSelection = printerActionSelection;
		this.scannerActionSelection = scannerActionSelection;
	}
	
	public void printJobs() {
		Iterator PrinterIterator = printerActionSelection.createIterator();
		Iterator ScannerIterator = scannerActionSelection.createIterator();
		printJobs(PrinterIterator, ScannerIterator);
	}
	
	public void printJobs(Iterator iterator, Iterator iterator2) {
		System.out.println("Welcome to the Chicago Public Library\n");
		System.out.println("Select a Printer Option \nAction - Description - Cost (in cents)");
		while (iterator.hasNext()) {
			PrinterOption printOption = (PrinterOption)iterator.next();
			System.out.print(printOption.getName() + " - ");
			System.out.print(printOption.getPrinterAction() + " - ");
			System.out.println(printOption.getPrice());
		}
		
		System.out.println();
		
		System.out.println("Select a Scanner Option \nAction - Description - Cost (in cents)");
		while (iterator2.hasNext()) {
			ScannerOption scannerOption = (ScannerOption)iterator2.next();
			System.out.print(scannerOption.getName() + " - ");
			System.out.print(scannerOption.getScannerAction() + " - ");
			System.out.println(scannerOption.getPrice());
	
		}
	}
}