package arraysjava;
import java.util.Scanner;
public class Task81 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter n1");
		int n1=scan.nextInt();
		System.out.println("enter n2");
		int n2=scan.nextInt();
		int sum=n1+n2;
		int diff=n1-n2;
		int product=n1*n2;
		int div=n1/n2;
		int mod=n1%n2;
		System.out.println("arithmetic operations");
		System.out.println("sum:"+sum);
		System.out.println("difference:"+diff);
		System.out.println("product:"+product);
		System.out.println("division:"+div);
		System.out.println("modulus:"+mod);
		int a=n1;
		System.out.println("assignment operations");
		a+=n2;
		System.out.println("after a+=n2 :"+a);
		a-=n2;
		System.out.println("after a-=n2 :"+a);
		a*=n2;
		System.out.println("after a*=n2 :"+a);
		a/=n2;
		System.out.println("after a/=n2 :"+a);
		a%=n2;
		System.out.println("after a%=n2 :"+a);
	}
}
