package soluzione26;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Title {
	private final String name;
	private final String author;
	private final String isbn;
	private final LocalDate publicationDate;
	private final String libOfCongress;

	private final List<LibraryItem> items = new ArrayList<>();

	public Title(String name, String author, String isbn, LocalDate publicationDate, String libOfCongress) {

		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.publicationDate = publicationDate;
		this.libOfCongress = libOfCongress;
	}

	/**
	 * Crea una copia e la associa a questo titolo.
	 */
	public LibraryItem addItem(String barCodeNumber) {
		LibraryItem item = new LibraryItem(barCodeNumber, this);
		items.add(item);
		return item;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public String getLibOfCongress() {
		return libOfCongress;
	}

	/**
	 * Restituisce una vista non modificabile delle copie.
	 */
	public List<LibraryItem> getItems() {
		return Collections.unmodifiableList(items);
	}
}