package animal;

import java.util.Objects;

// ROLE
abstract class HabitatRole {
    private final Animal animal;

    protected HabitatRole(Animal animal) {
        this.animal = Objects.requireNonNull(animal);
    }

    public Animal getAnimal() {
        return animal;
    }

    public abstract void move();
}

// CONCRETE ROLES

class AquaticAnimal extends HabitatRole {
    // La creazione del ruolo avviene tramite Animal
    AquaticAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public void move() {
        System.out.println(getAnimal().getName() + " nuota.");
    }
}

class LandAnimal extends HabitatRole {
    LandAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public void move() {
        System.out.println(getAnimal().getName() + " si muove sulla terra.");
    }
}