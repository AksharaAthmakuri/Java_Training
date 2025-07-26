package exceptiontask;
public class Task54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {17,45,56,28,98,66};
		try {
			System.out.println(a[6]);
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("array index error");
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero error");
		}
	}
}
