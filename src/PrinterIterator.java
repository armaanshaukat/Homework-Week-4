
public class PrinterIterator implements Iterator {
	PrinterOption[] options;
	int position = 0;
	
	public PrinterIterator(PrinterOption[] printerOptions) {
		this.options = printerOptions;
	}
	
	public boolean hasNext() {
		if (position >= options.length || options[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}

	public Object next() {
		PrinterOption printerOptions = options[position];
		position = position + 1;
		return printerOptions;
	}
}
