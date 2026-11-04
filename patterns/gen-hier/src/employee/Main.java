package employee;
public class Main {
    public static void main(String[] args) {
        Manager anna = new Manager("Anna");
        Manager marco = new Manager("Marco");

        Secretary lucia = new Secretary("Lucia");
        Technician paolo = new Technician("Paolo");
        Technician giulia = new Technician("Giulia");

        anna.addSubordinate(lucia);
        anna.addSubordinate(marco);

        marco.addSubordinate(paolo);
        marco.addSubordinate(giulia);

        anna.printHierarchy("");
    }
}