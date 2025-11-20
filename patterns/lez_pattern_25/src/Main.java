import java.util.*;

// Classe astratta: rappresenta un ruolo generico
abstract class Ruolo {

    public Ruolo(Persona p) {
        p.addRuolo(this);
    }

    public abstract void descrivi();
}

// ---------------------- RUOLI CONCRETI ----------------------

class Studente extends Ruolo {
    public Studente(Persona p) { super(p); }

    @Override
    public void descrivi() {
        System.out.println(" è uno Studente");
    }

    public void seguiCorso(String corso) {
        System.out.println(" segue il corso di " + corso);
    }
}

class Docente extends Ruolo {
    public Docente(Persona p) { super(p); }

    @Override
    public void descrivi() {
        System.out.println(" è un Docente");
    }

    public void insegnaCorso(String corso) {
        System.out.println(" insegna il corso di " + corso);
    }
}

class Tutor extends Ruolo {
    public Tutor(Persona p) { super(p); }

    @Override
    public void descrivi() {
        System.out.println(" è un Tutor");
    }

    public void aiutaStudente(String nomeStudente) {
        System.out.println(" aiuta lo studente " + nomeStudente);
    }
}

// ---------------------- CLASSE PLAYER ----------------------

class Persona {
    private String nome;

    private List<Ruolo> ruoli = new ArrayList<>();

    public Persona(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void addRuolo(Ruolo r) {
        ruoli.add(r);
    }

    public void mostraRuoli() {
        System.out.println("Ruoli di " + nome + ":");
        for (Ruolo r : ruoli) {
            r.descrivi();
        }
    }
}

// ---------------------- MAIN ----------------------

public class Main {
    public static void main(String[] args) {
        Persona mario = new Persona("Mario");

        // Mario ricopre più ruoli
        Studente studente = new Studente(mario);
        Tutor tutor = new Tutor(mario);


        // Mostra ruoli
        mario.mostraRuoli();

        // Azioni specifiche dei ruoli
        studente.seguiCorso("Ingegneria del Software");
        tutor.aiutaStudente("Luigi");

        // Possiamo aggiungere un nuovo ruolo in futuro, ad esempio:
        Docente docente = new Docente(mario);
        docente.insegnaCorso("Programmazione Java");
    }
}
