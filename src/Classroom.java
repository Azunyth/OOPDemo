import java.util.ArrayList;

public class Classroom {

	private Worker teacher;
	private ArrayList<Studentable> students;
	
	public Classroom() {
		this.students = new ArrayList<Studentable>();
	}
	
	public void viewStudents() {
		for(Studentable s : students) {
			s.sayName();
		}
	}
	
	public void addStudent(Studentable student) {
		this.students.add(student);
	}
	
	public void removeStudent(int idx) {
		this.students.remove(idx);
	}

	public Worker getTeacher() {
		return teacher;
	}

	public void setTeacher(Worker teacher) {
		this.teacher = teacher;
	}
	
}
