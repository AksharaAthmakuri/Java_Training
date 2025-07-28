package multithreadingtask;
class CounterThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			synchronized (Task7.class) {
				Task7.count++;
			}
		}
	}
}
public class Task7 {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterThread1 t1=new CounterThread1();
		CounterThread1 t2=new CounterThread1();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("final count:"+count);
	}
}
