package observableobserver.observable;

import java.util.Observable;
import java.util.Random;

public class Lotteria extends Observable {

    static Random rnd = new Random();

    public void draw() {
        int numero = rnd.nextInt(100) + 1;
        setChanged();
        notifyObservers(Integer.valueOf(numero));
    }
}