
public class DriverMethod {

	public static void main(String[] args) {
		PrinterOptions printerJobSelection = new PrinterOptions();
		
		Scheduler scheduler = new Scheduler(printerJobSelection);
		
		scheduler.printJobs();
	}
}