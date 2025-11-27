package proxy;

interface MiaLista{   void add();}

class ListProxy implements MiaLista{
	PersistentList pl = null;
	public void add() {
		if (pl== null) pl = new PersistentList();
		pl.add();
	}
}

class PersistentList implements MiaLista{
	PersistentList(){System.out.println("APRO DB");}
	public void add() {System.out.println("SCRIVO SU DB");}
}


public class UsoMiaLista {
	
	public static void main(String[] args) {
		MiaLista ml = new ListProxy();
		System.out.println("ho creato la lista");
		ml.add();
		
	}

}
