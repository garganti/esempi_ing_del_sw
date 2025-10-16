package contatti_cli;

import java.util.List;

import contatti.jooq.DataService;
import contatti.jooq.generated.tables.records.IndirizziRecord;

public class CommandLineInterface {

    public static void main(String[] args) {
	// domanda all'utente cosa vuole fare:
	// 1. inserire un nuovo indirizzo
	// 2. vedere gli indirizzi inseriti
	// TODO

	// per ora stampa solo gli indirizzi	
	List<IndirizziRecord> indirizzi = DataService.getIndirizziRecord();
	for (IndirizziRecord i : indirizzi) {
	    System.out.println(i);
	}

    }

}
