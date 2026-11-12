package observableobserver;

import java.util.Timer;
import java.util.TimerTask;

import observableobserver.observable.Lotteria;
import observableobserver.observer.Ludopatico;
import observableobserver.observer.MontagnaMare;

public class Sistema {

    public static void main(String[] args) {
        Lotteria l = new Lotteria();
        Ludopatico ld = new Ludopatico();
        l.addObserver(ld);
        MontagnaMare mm = new MontagnaMare();
        l.addObserver(mm);

        Timer timer = new Timer("ruota di milano");
        TimerTask tt = new TimerTask() {
            private int cont = 0;

            @Override
            public void run() {
                if (cont < 100) {
                    l.draw();
                    cont++;
                } else {
                    timer.cancel();
                }
            }
        };
        timer.schedule(tt, 0, 2000);
    }
}