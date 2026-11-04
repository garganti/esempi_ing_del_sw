package soluzione26;

import java.util.Objects;

class LibraryItem {
	private final String barCodeNumber;
	private final Title title;

	// Visibilità di package: la creazione avviene tramite Title.addItem().
	LibraryItem(String barCodeNumber, Title title) {
		this.barCodeNumber = Objects.requireNonNull(barCodeNumber);
		this.title = Objects.requireNonNull(title);
	}

	public String getBarCodeNumber() {
		return barCodeNumber;
	}

	public Title getTitle() {
		return title;
	}
}