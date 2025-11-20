package lez_pattern_25.abs_occ.auto;
// --- ABSTRACT: il "tipo" di oggetto ---
class VehicleType {
    private String name;
    private String engineType;
    private int numberOfSeats;

    public VehicleType(String name, String engineType, int numberOfSeats) {
        this.name = name;
        this.engineType = engineType;
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "VehicleType{name='" + name + "', engineType='" + engineType +
               "', seats=" + numberOfSeats + "}";
    }
}

// --- OCCURRENCE: l’istanza concreta del tipo ---
class Vehicle {
    private String licensePlate;
    private String owner;
    private VehicleType type; // associazione con l'Abstract

    public Vehicle(String licensePlate, String owner, VehicleType type) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Vehicle " + licensePlate + " owned by " + owner);
        System.out.println("  Type: " + type.getName());
        System.out.println("  Engine: " + type.getEngineType());
        System.out.println("  Seats: " + type.getNumberOfSeats());
        System.out.println();
    }
}

// --- DEMO ---
public class AbstractOccurrenceDemo {
    public static void main(String[] args) {
        // Creazione dei tipi (Abstract)
        VehicleType sedan = new VehicleType("Sedan", "Diesel", 5);
        VehicleType sportsCar = new VehicleType("Sports Car", "Petrol", 2);

        // Creazione delle occorrenze (Occurrence)
        Vehicle car1 = new Vehicle("AB123CD", "Alice Rossi", sedan);
        Vehicle car2 = new Vehicle("EF456GH", "Luca Bianchi", sedan);
        Vehicle car3 = new Vehicle("ZX999ZZ", "Marco Verdi", sportsCar);

        // Uso del pattern
        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}
