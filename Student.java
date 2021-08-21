package week3.Day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Arun Kumar");
	}

	public void studentDept() {
		System.out.println("Mechanical Department");
	}

	public void studentid() {
		System.out.println("The id is 141103");
	}

	public static void main(String[] args) {

		Student StObj = new Student();
		StObj.collegename();
		StObj.collegecode();
		StObj.collegerank();
		System.out.println("----------------------------");
		StObj.Departname();
		System.out.println("----------------------------");
		StObj.studentid();
		StObj.studentName();
		StObj.studentDept();
	}

}
