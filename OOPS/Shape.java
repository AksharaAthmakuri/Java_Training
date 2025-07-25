package javaoops_polymorphism;
abstract class Shape{
	 abstract double area();
}
class Circle extends Shape{
	 double r;
	 Circle( double r)
	 {
		 this.r=r;
	 }
	public double area()
	{
		return Math.PI*r*r;
	}
}
class Rectangle extends Shape{
	double l;double b;
	Rectangle(double l,double b)
	{
		this.b=b;
		this.l=l;
	}
	public double area()
	{
		return l*b;
	}
}
public class Task4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c=new Circle(5);
        System.out.println(c.area());
		Rectangle r=new Rectangle(45,30);
		System.out.println(r.area());
	}
}
