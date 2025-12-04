package lezione_4dic25;

import java.math.BigInteger;

public class CalcolatorModel {
	
	private BigInteger valore = BigInteger.ONE;
	
	void moltiplicaPer(int x){
		valore = valore.multiply(BigInteger.valueOf(x));
	}
	
	void reset() {
		valore = BigInteger.ONE;
	}
	
	public String getValore() {
		return valore.toString();
	}

}
