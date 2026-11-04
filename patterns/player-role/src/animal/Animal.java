package animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// PLAYER
abstract class Animal {
    private final String name;
    private final List<HabitatRole> habitatRoles = new ArrayList<>();

    protected Animal(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

    public List<HabitatRole> getHabitatRoles() {
        return Collections.unmodifiableList(habitatRoles);
    }

    public AquaticAnimal addAquaticRole() {
        return addRole(new AquaticAnimal(this));
    }

    public LandAnimal addLandRole() {
        return addRole(new LandAnimal(this));
    }

    private <T extends HabitatRole> T addRole(T role) {
        if (habitatRoles.size() >= 2) {
            throw new IllegalStateException(
                "Un animale può avere al massimo due ruoli di habitat"
            );
        }

        for (HabitatRole existing : habitatRoles) {
            if (existing.getClass() == role.getClass()) {
                throw new IllegalStateException(
                    "L'animale possiede già questo ruolo"
                );
            }
        }

        habitatRoles.add(role);
        return role;
    }

    public void removeRole(HabitatRole role) {
        habitatRoles.remove(role);
    }
}

// CLASSIFICAZIONE PER TIPO DI ALIMENTAZIONE

class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }
}

class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }
}

class Omnivore extends Animal {
    public Omnivore(String name) {
        super(name);
    }
}

