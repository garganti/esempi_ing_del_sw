package student;
// GERARCHIA DEI RUOLI DI LIVELLO

import java.util.Objects;

abstract class LevelRole {
	private final Student student;

	protected LevelRole(Student student) {
		this.student = Objects.requireNonNull(student);
	}

	public Student getStudent() {
		return student;
	}

	public abstract String getDescription();
}

class GraduateStudent extends LevelRole {
	GraduateStudent(Student student) {
		super(student);
	}

	@Override
	public String getDescription() {
		return "Graduate";
	}
}

class UndergraduateStudent extends LevelRole {
	UndergraduateStudent(Student student) {
		super(student);
	}

	@Override
	public String getDescription() {
		return "Undergraduate";
	}
}