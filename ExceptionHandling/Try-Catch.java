package exceptiontask;
import java.util.Scanner;
public class Task51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		try {
			System.out.println(100/n);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException Occuredd , cannot divide by zero");
		}
	}
}
