package exceptiontask;
interface RemoteControl{
	abstract void turnOn();
	default void batteryStatus()
	{
		System.out.println("battery on");
	}
}
public class Task21 implements RemoteControl  {
	public void turnOn() {
		System.out.println("the machine is on");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task21 obj=new Task21();
		obj.turnOn();
		obj.batteryStatus();
	}
}
