package javaoops_polymorphism;
abstract class Appliance
{
	abstract void turnon();
}
interface Connectable{
	void connect();
}
class SmartTv extends Appliance implements Connectable{
	public void turnon()
	{
		System.out.println("turnon the tv");
	}
	public void connect()
	{
		System.out.println("tv is connected");
	}
}
public class Task8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv s=new SmartTv();
		s.turnon();
		s.connect();
	}
}
