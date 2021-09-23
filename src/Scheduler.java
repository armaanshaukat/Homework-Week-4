
public class Scheduler {
	PrinterOptions printerJobSelection;
	
	public Scheduler(PrinterOptions printerJobSelection) {
		this.printerJobSelection = printerJobSelection;
	}
	
	public void printJobs() {
		Iterator PrinterIterator = printerJobSelection.createIterator();
		System.out.println("Job Types Available");
		printJobs(PrinterIterator);
	}
	
	public void printJobs(Iterator iterator) {
		while (iterator.hasNext()) {
			PrinterOption printOption = (PrinterOption)iterator.next();
			System.out.println(printOption.getName() + ", ");
			System.out.println(printOption.getPrinterType() + ", ");
			System.out.println(printOption.getPrice() + ", ");
		}
	}
}