package multithreadingtask;
class RunnableCounter implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class Task2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableCounter r=new RunnableCounter();
		Thread t=new Thread(r);
		t.start();
	}
}
