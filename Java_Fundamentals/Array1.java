package arraysjava;
import java.util.Scanner;
public class Task101 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter 10 integers:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int sum=0;
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		double avg=sum/10.0;
		System.out.println("sum:" +sum);
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		System.out.println("avg:"+avg);
	}
}
