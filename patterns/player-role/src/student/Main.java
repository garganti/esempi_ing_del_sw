package student;
public class Main {
    public static void main(String[] args) {
        Student lucia = new Student(
            "Lucia",
            Attendance.FULL_TIME,
            Level.UNDERGRADUATE
        );

        lucia.printInfo();

        // Lucia cambia modalità di frequenza
        lucia.setAttendance(Attendance.PART_TIME);

        // Successivamente cambia livello di studi
        lucia.setLevel(Level.GRADUATE);

        System.out.println("\nDopo il cambiamento:");
        lucia.printInfo();
    }
}