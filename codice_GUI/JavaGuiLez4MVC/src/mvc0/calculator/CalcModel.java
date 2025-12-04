package mvc0.calculator;

public class CalcModel {
	
	private double value;
	
	public CalcModel() {
		value = 1;
	}
	
	// resetta il valore
	public void clear(){
		value = 1;
		System.out.println(" reset value");
	}

	public void multiply(double d){
		value *= d;
		System.out.println(" mutliplying value " + d);
	}

	public double getValue() {
		return value;
	}
}
