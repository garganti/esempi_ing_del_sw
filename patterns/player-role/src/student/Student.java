package student;
import java.util.Objects;

// PLAYER
class Student {
    private final String name;

    // Esattamente un ruolo per ciascuna dimensione
    private AttendanceRole attendanceRole;
    private LevelRole levelRole;

    public Student(String name, Attendance attendance, Level level) {
        this.name = Objects.requireNonNull(name);
        setAttendance(attendance);
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public AttendanceRole getAttendanceRole() {
        return attendanceRole;
    }

    public LevelRole getLevelRole() {
        return levelRole;
    }

    public void setAttendance(Attendance attendance) {
        Objects.requireNonNull(attendance);

        switch (attendance) {
            case FULL_TIME:
                attendanceRole = new FullTimeStudent(this);
                break;
            case PART_TIME:
                attendanceRole = new PartTimeStudent(this);
                break;
        }
    }

    public void setLevel(Level level) {
        Objects.requireNonNull(level);

        switch (level) {
            case GRADUATE:
                levelRole = new GraduateStudent(this);
                break;
            case UNDERGRADUATE:
                levelRole = new UndergraduateStudent(this);
                break;
        }
    }

    public void printInfo() {
        System.out.println("Studente: " + name);
        System.out.println("Frequenza: " + attendanceRole.getDescription());
        System.out.println("Livello: " + levelRole.getDescription());
    }
}

enum Attendance {
    FULL_TIME,
    PART_TIME
}

enum Level {
    GRADUATE,
    UNDERGRADUATE
}



