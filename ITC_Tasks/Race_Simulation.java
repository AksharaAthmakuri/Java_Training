package multithreadingtask;
class Animal implements Runnable{
	String name;
	public Animal(String name)
	{
		this.name=name;
		new Thread(this,name).start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+": running");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
		}
	}
}
public class Task11 {
	public static void main(String[] args) {
	Animal a=new Animal("tortoise");
	Animal b=new Animal("rabbit");
	Animal c=new Animal("dog");
	}
}
