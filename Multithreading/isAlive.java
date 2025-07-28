package multithreadingtask;
class MyThread extends Thread{
	public void run()
	{
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("interrupted Exception");
		}
	}
}
public class Task4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		System.out.println("before start:"+t.isAlive());
		t.start();
		System.out.println("after start:"+t.isAlive());
		try {
			t.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("after join:"+t.isAlive());
	}
}
