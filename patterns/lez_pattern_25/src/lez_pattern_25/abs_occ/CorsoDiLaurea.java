package lez_pattern_25.abs_occ;

import java.util.ArrayList;
import java.util.List;

public class CorsoDiLaurea {
	
	private String nome;
	
	enum TipoCdL{LT, LM, CU};
	
	TipoCdL tipoCdL;
	
	// I modo per tradurre l'associazione CdL Ins
	private List<Insegnamento> insegnamenti = new ArrayList<>();
	
	
	public void addInsegnamento(Insegnamento i) {
		insegnamenti.add(i);
		//
		i.cdl = this;
	}
}
