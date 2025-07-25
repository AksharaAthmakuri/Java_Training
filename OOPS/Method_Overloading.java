package javaoops_polymorphism;
class Calculator1{
	int add(int a,int b)
	{
		int res=0;
		res=a+b;
		return res;
	}
	double add(double x,double y)
	{
	double res1=0;
		res1=x+y;
		return res1;
	}
	String add(String s1,String s2)
	{
		String res2="";
		res2=s1+s2;
		return res2;
	}
}
public class Task6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1=new Calculator1();
		System.out.println(c1.add("alex","bob"));
		System.out.println(c1.add(25.32,65.43));
	}
}
