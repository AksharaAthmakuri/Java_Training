package exceptiontask;
interface RemoteControl1{
	static void info()
	{
		System.out.println("static method called");
	}
}
public class Task22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl1.info();
	}
}
