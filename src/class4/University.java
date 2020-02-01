package class4;

public class University {
	JavaProfessor jp[] = new JavaProfessor[10];
	DatabaseProfessor dp[] = new DatabaseProfessor[3];
	AlgorithmsProfessor ap[] = new AlgorithmsProfessor[5];
	MachineLearningProfessor mp[] = new MachineLearningProfessor[10];

	Professor p[] = new Professor[100];

	public static void main(String[] args) {
		University u = new University();
		// Logic to add professors;
		// System.out.println(u.calculateSalariesOfProfessors());
		// u.inviteProfessorsToEvent();

		Professor p;
		JavaProfessor siva = new JavaProfessor();
		siva.takeAttendance();
		JavaProfessor ashish = new JavaProfessor();
		siva = ashish;
		p = siva;
		p.takeAttendance();
		// JavaProfessor x = (JavaProfessor)p;
		p = new MachineLearningProfessor();
		p.takeAttendance();

	}

	public float caculateSalaries() {
		float total = 0;
		for (Professor pp : p) {
			total = total + pp.salary;
		}
		return total;
	}

	public float calculateSalariesOfProfessors() {
		float total = 0;
		for (JavaProfessor x : jp) {
			total = total + x.salary;
		}
		for (DatabaseProfessor d : dp) {
			total = total + d.salary;
		}
		for (AlgorithmsProfessor a : ap) {
			total = total + a.salary;
		}
		return total;
	}

	public void inviteProfessorsToEvent() {
		for (JavaProfessor x : jp) {
			x.receiveInvitation();
		}
		for (DatabaseProfessor d : dp) {
			d.receiveInvitation();
		}
		for (AlgorithmsProfessor a : ap) {
			a.receiveInvitation();
		}
	}

}

abstract class Professor {
	float salary;
	String name;

	abstract void teach();

	void takeAttendance() {
		System.out.println("Professor is taking attendance");

	}

	void turnOffTheLights() {

	}

	void receiveInvitation() {
		System.out.println("Recieve Invitation..");
	}

	// abstract void identifyTheTopStudentsInClass();

}

class MachineLearningProfessor extends Professor {

	@Override
	void teach() {
		// TODO Auto-generated method stub

	}

}

class JavaProfessor extends Professor {

	@Override
	void teach() {
		// TODO Auto-generated method stub

	}

	@Override
	void takeAttendance() {
		System.out.println("Java professor is just scanning the students for taking attendance");
	}

}

class DatabaseProfessor extends Professor {

	@Override
	void teach() {
		// TODO Auto-generated method stub

	}

}

class AlgorithmsProfessor extends Professor {

	@Override
	void teach() {
		// TODO Auto-generated method stub

	}

}