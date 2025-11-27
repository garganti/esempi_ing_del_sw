package factory;

abstract class Pizza{ abstract void cuoci();}

class PizzaMargherita extends Pizza{
	void cuoci() { System.out.println("cuocio la margherita");}}

class PizzaCapricciosa extends Pizza{
	void cuoci() {	System.out.println("cuocio la carpicciosa");}
}

enum TipoPizza {MARG, CAPR}

class PizzaFactory{
	// sigleton
	private PizzaFactory() {}
	static PizzaFactory pizzaFact = new PizzaFactory();
	// factory
	Pizza crea(TipoPizza tp){
		if (tp == TipoPizza.MARG) 
			return new PizzaMargherita();
		if (tp == TipoPizza.CAPR)
			return new PizzaCapricciosa();
		throw new RuntimeException("ma che pizza è???");
	}
}

class PizzaStore{
	void ordina(TipoPizza tp){
/*		if (tp == TipoPizza.MARG) {
			PizzaMargherita pm = new PizzaMargherita();
			pm.cuoci();
		}
		if (tp == TipoPizza.CAPR) {
			PizzaCapricciosa pm = new PizzaCapricciosa();
			pm.cuoci();
		}*/
		Pizza np = PizzaFactory.pizzaFact.crea(tp);
		np.cuoci();
	}
}


public class FactoryPizzaUso {

}
