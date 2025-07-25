package arraysjava;
import java.util.Scanner;
public class Task93 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num1 :");
		double n1=scan.nextDouble();
		System.out.println("enter num2 :");
		double n2=scan.nextDouble();
		System.out.println("choose any operation");
		System.out.println("1. addition(+)");
		System.out.println("2. substraction(-)");
		System.out.println("3. multiplication(*)");
		System.out.println("4. division(/)");
		System.out.println("5. modulus(%)");
		System.out.println("enter your choice from 1-5 :");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("result :" +(n1+n2));
			break;
		case 2:
			System.out.println("result :" +(n1-n2));
			break;
		case 3:
			System.out.println("result :" +(n1*n2));
			break;
		case 4:
			System.out.println("result :" +(n1/n2));
			break;
		case 5:
			System.out.println("result :" +(n1%n2));
			break;
			default:
			System.out.println("enter valid number 1-5");
			break;
		}
	}
}
