package observableobserver.observer;

import java.util.Observable;
import java.util.Observer;

public class MontagnaMare implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		var valoreEstratto = ((Integer) arg).intValue();
		if (valoreEstratto < 20) {
			System.out.println("MARE !!!!");
		} else {
			System.out.println("MONTAGNA !!!!");
		}

	}

}