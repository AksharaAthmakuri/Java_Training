package service;
import model.Student;
public class StudentService {
	public void details(Student s)
	{
		System.out.println("the id of student is :"+s.id);
		System.out.println("name of the student is:"+s.name);
	}
}
