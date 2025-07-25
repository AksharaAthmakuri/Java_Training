package exceptiontask;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task42 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		double n=scan.nextDouble();
		double sqrt=sqrt(n);
		double power=pow(n,2);	
		System.out.println("square root of the number is:"+sqrt);
		System.out.println("power :"+power);
	}
}
