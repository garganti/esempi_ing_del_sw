package animal;
public class Main {
    public static void main(String[] args) {
        // Il tipo di alimentazione è rappresentato dalla sottoclasse
        Animal orso = new Omnivore("Orso");

        // L'animale assume due ruoli di habitat
        LandAnimal landRole = orso.addLandRole();
        AquaticAnimal aquaticRole = orso.addAquaticRole();

        landRole.move();
        aquaticRole.move();

        System.out.println("Numero di ruoli: "
                + orso.getHabitatRoles().size());

        // L'animale può perdere un ruolo durante la sua vita
        orso.removeRole(aquaticRole);

        System.out.println("Ruoli dopo la rimozione: "
                + orso.getHabitatRoles().size());
    }
}