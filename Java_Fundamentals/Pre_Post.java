package arraysjava;
public class Task82 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pre/post increment===");
		int a=5;
		System.out.println("initial a:"+a);
		System.out.println("post-increment a:"+ (a++));
		System.out.println("after post-increment a:"+a);
		System.out.println("pre-increment a"+(++a));
		//bitwise
		int x=8;
		System.out.println("x :"+x);
		System.out.println("x<<1 :"+(x<<1));
		System.out.println("x>>1 :"+(x>>1));
		//bitwise vs logical
		System.out.println(("logical vs bitwise"));
		int num1=10;
		int num2=5;
		System.out.println("bitwise AND :"+((num1<num2)&(num1++>num2)));
		System.out.println("value of num1 after &="+num1);
		//num1 is increment
		num1=10;//reset num1
		System.out.println("logical AND (&&) :" +((num1<num2)&&(num1++>num2)));
		System.out.println("value of num1 after && :" +num1);
		//num1 not incremented
	}
}
