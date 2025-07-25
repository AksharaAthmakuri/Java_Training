package javaoops_polymorphism;
class Vehicle{
	String brand;
	double speed;
  Vehicle(String brand,double speed)
  {
	  this.brand=brand;
	  this.speed=speed;
  }
  void showDetails()
  {
	  System.out.println("the brand:"+brand);
	  System.out.println("the speed:"+speed);
  }
}
class Car extends Vehicle{
	Car(String brand,double speed)
	{
		super(brand,speed);
	}
	void showDetails()
	{
		System.out.println("details of car");
		super.showDetails();
	}
}
class Bike extends Vehicle{
	Bike(String brand,double speed)
	{
		super(brand,speed);
	}
	void showDetails()
	{
		System.out.println("details of car");
		super.showDetails();
	}
}
public class Task5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("bmw",238.00);
		c.showDetails();
		Bike b=new Bike("honda", 23.0);
		b.showDetails();
	}
}
