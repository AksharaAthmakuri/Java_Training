package javamain;
import model.*;
import service.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.id=1;
		s.name="priya";
		StudentService s1=new StudentService();
		s1.details(s);
	}
}
