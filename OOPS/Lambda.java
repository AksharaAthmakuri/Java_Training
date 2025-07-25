package javaoops_polymorphism;
interface MathOperation{
	int operate(int a,int b);
}
public class Task11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add=(a,b)->a+b;
		MathOperation sub=(a,b)->a-b;
		MathOperation mul=(a,b)->a*b;
		System.out.println(add.operate(10,45));
		System.out.println(sub.operate(85,45));
		System.out.println(mul.operate(20,5));
	}
}
