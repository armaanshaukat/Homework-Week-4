
public class ScannerIterator implements Iterator {
	ScannerOption[] options;
	int position = 0;
	
	public ScannerIterator(ScannerOption[] scannerOptions) {
		this.options = scannerOptions;
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
		ScannerOption scannerOptions = options[position];
		position = position + 1;
		return scannerOptions;
	}
}