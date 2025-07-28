package multithreadingtask;
class CounterThread extends Thread{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			Task6.count++;
		}
	}
}
public class Task6 {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterThread t1=new CounterThread();
		CounterThread t2=new CounterThread();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured");
		}
		System.out.println("final count value"+count);
	}
}
