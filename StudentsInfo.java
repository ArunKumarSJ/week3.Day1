package week3.Day1;

public class StudentsInfo {
public void getStudentinfo(int id) {
	System.out.println("The Student ID is:"+id);
}
public void getStudentinfo(int id,String Name) {
	System.out.println("The Student id:"+id);
	System.out.println("The Name of the Student:"+Name);
}
public void getStudentinfo(String mail,Long phone) {
	System.out.println("The Student Mail id is:"+mail);
	System.out.println("The Phone number of the Student:"+phone);
}
public static void main(String[] args) {
	StudentsInfo SObj=new StudentsInfo();
	SObj.getStudentinfo(25);
	SObj.getStudentinfo(25, "Arun");
	SObj.getStudentinfo("sarva@gmail.com", 9874571627l);
}
}
