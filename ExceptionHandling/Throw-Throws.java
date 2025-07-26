package exceptiontask;
public class Task53 {
	static void validateAge(int age)throws Exception{
		if(age<18)
		{
			throw new Exception("not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(19);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
