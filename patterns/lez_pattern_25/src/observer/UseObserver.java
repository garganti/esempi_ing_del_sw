package observer;

import java.util.ArrayList;
import java.util.List;

abstract class Observable{
	private List<Observer> observers = new ArrayList<>();
	
	void addObserver(Observer o) {observers.add(o);}
	
	void notifyObservers() {
		for(Observer o: observers) o.update();
	}
}

class Inventory extends Observable{
	
	void addItem() {notifyObservers();}

	void removeItem() {notifyObservers();}

}

interface Observer {
	void update();
}

class ConsolePrinter implements Observer{

	@Override
	public void update() {
		System.out.println("L'inventory è stato modificato");
	}}

public class UseObserver {
	
	public static void main(String[] args) {
		Inventory i = new Inventory();
		Observer o = new ConsolePrinter();
		i.addObserver(o);
		//
		i.addItem();
		
	}

}
