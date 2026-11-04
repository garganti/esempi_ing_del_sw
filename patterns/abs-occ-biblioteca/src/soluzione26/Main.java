package soluzione26;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Title libro = new Title("Il nome della rosa", "Umberto Eco", "9788845292613", LocalDate.of(1980, 1, 1),
				"PQ4865.C6");

		LibraryItem copia1 = libro.addItem("BAR001");
		LibraryItem copia2 = libro.addItem("BAR002");

		System.out.println("Titolo: " + libro.getName());
		System.out.println("Numero di copie: " + libro.getItems().size());

		for (LibraryItem copia : libro.getItems()) {
			System.out.println("Codice copia: " + copia.getBarCodeNumber());
		}

		System.out.println(
				"La copia " + copia1.getBarCodeNumber() + " appartiene al titolo " + copia1.getTitle().getName());
	}
}