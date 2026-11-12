package singleton;

public class Singleton {

	public static void main(String[] args) {
		// please print the diamater of Terra
		//System.out.println(new Terra().diametroKm);
		System.out.println(Terra.miaTerra.diametroKm);
	}
	
}

final class Terra{
	final int diametroKm;
	
	private Terra(){
		diametroKm = 11000;
	}
	static Terra miaTerra = new Terra();
}

class AntiPatternTerra{
	static final int getDiametro() {return 110000;}
}
