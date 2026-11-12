package observableobserver.observer;

import java.util.Observable;
import java.util.Observer;

public class Ludopatico implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		var valoreEstratto = ((Integer) arg).intValue();
		if (valoreEstratto % 2 == 0) {
			System.out.println("HO VINTO !!!!");
		} else {
			System.out.println("HO PERSO !!!!");
		}
	}
}
