import java.util.ArrayList;
import java.util.List;

class Observable{
	List<Observer> myObserver = new ArrayList<>();
	void addObserver(Observer o){
		myObserver.add(o);
	}
	void notifyObserver() {
		for(Observer o: myObserver) o.update();
	}
}
// voglio monitorare il livello dell'acqua
class Piscina extends Observable{}

interface Observer { void update();}
// monitor della piscina
class Monitor implements Observer{
	@Override
	public void update() {
		System.out.println("la piscina è cambiata");
	}}

public class ObserveEsempio {

	public static void main(String[] args) {
		Monitor m = new Monitor();
		Piscina p = new Piscina();
		
		p.addObserver(m);
	
		// succede qualcosa
		p.notifyObserver();
	}
}
