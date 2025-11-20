import java.math.BigInteger;

class Terra{
	private Terra() {}
	
	static Terra istanza = new Terra();

	public BigInteger getDiametro() {
		return new BigInteger("12437889090999990900309393003");
	}	
}


public class Singleton {
	
	public static void main(String[] args) {
		System.out.println(Terra.istanza.getDiametro());
	}

}
