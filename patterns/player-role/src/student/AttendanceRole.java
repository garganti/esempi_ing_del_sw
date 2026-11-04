package student;
// GERARCHIA DEI RUOLI DI FREQUENZA

import java.util.Objects;

abstract class AttendanceRole {
    private final Student student;

    protected AttendanceRole(Student student) {
        this.student = Objects.requireNonNull(student);
    }

    public Student getStudent() {
        return student;
    }

    public abstract String getDescription();
}

class FullTimeStudent extends AttendanceRole {
    FullTimeStudent(Student student) {
        super(student);
    }

    @Override
    public String getDescription() {
        return "Tempo pieno";
    }
}

class PartTimeStudent extends AttendanceRole {
    PartTimeStudent(Student student) {
        super(student);
    }

    @Override
    public String getDescription() {
        return "Tempo parziale";
    }
}