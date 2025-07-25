package scenariotask;
interface Controllable{
	void turnOn();
	void turnOff();
	default void Status() {
		System.out.println("device is working fine");
	}
	public static void deviceInfo() {
		System.out.println("information of the device");
	}
}
class Fan implements Controllable{
	 public void turnOn() {
		System.out.println("fan is on");
	}
	 public void turnOff() {
		 System.out.println("fan is off");
	 }
}
class Light implements Controllable{
	public void turnOn()
	{
		System.out.println("light is on");
	}
	public void turnOff()
	{
		System.out.println("light is off");
	}
}
public class Task2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f=new Fan();
		Controllable.deviceInfo();
		f.turnOn();
		f.Status();
		Light l=new Light();
		Controllable.deviceInfo();
		l.turnOn();
		l.turnOff();
	}
}
