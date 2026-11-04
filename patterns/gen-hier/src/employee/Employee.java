package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

abstract class Employee {

	private final String name;

	// Nodo padre: molteplicità 0..1
	private Manager supervisor;

	// Nodi figli: molteplicità 0..*
	private final List<Employee> subordinates = new ArrayList<>();

	protected Employee(String name) {
		this.name = Objects.requireNonNull(name);
	}

	public String getName() {
		return name;
	}

	public Manager getSupervisor() {
		return supervisor;
	}

	public List<Employee> getSubordinates() {
		return Collections.unmodifiableList(subordinates);
	}

	/**
	 * Aggiunge un dipendente alla gerarchia sotto questo dipendente. Solo un
	 * Manager può avere subordinati.
	 */
	public void addSubordinate(Employee employee) {
		Objects.requireNonNull(employee);

		if (!(this instanceof Manager)) {
			throw new IllegalStateException("Solo un manager può supervisionare dipendenti");
		}

		// Evita di creare un ciclo nella gerarchia
		for (Employee current = this; current != null; current = current.supervisor) {

			if (current == employee) {
				throw new IllegalArgumentException("L'operazione creerebbe un ciclo nella gerarchia");
			}
		}

		Manager newSupervisor = (Manager) this;

		if (employee.supervisor == newSupervisor) {
			return;
		}

		// Scollega il dipendente dal precedente supervisore
		if (employee.supervisor != null) {
			Employee oldSupervisor = employee.supervisor;
			oldSupervisor.subordinates.remove(employee);
		}

		// Collega entrambi i lati della relazione
		employee.supervisor = newSupervisor;
		subordinates.add(employee);
	}

	/**
	 * Rimuove un dipendente dai subordinati diretti.
	 */
	public void removeSubordinate(Employee employee) {
		Objects.requireNonNull(employee);

		if (employee.supervisor == this) {
			subordinates.remove(employee);
			employee.supervisor = null;
		}
	}

	/**
	 * Stampa ricorsivamente il sottoalbero della gerarchia.
	 */
	public void printHierarchy(String indentation) {
		System.out.println(indentation + name);

		for (Employee subordinate : subordinates) {
			subordinate.printHierarchy(indentation + "  ");
		}
	}
}

class Manager extends Employee {
	public Manager(String name) {
		super(name);
	}
}

class Secretary extends Employee {
	public Secretary(String name) {
		super(name);
	}
}

class Technician extends Employee {
	public Technician(String name) {
		super(name);
	}
}