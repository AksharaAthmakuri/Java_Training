package multithreadingtask;
class Sample extends Thread{
	Sample(){
		System.out.println("thread:"+Thread.currentThread().getName()+"state:new");
	}
		public void run()
		{
			System.out.println("thread:"+Thread.currentThread().getName()+"state:running");
			try {
				for(int i=1;i<=5;i++)
				{
					System.out.println("thread:"+Thread.currentThread().getName()+":"+i);
					sleep(1000);
				}
		}
			catch(InterruptedException ex)
			{
				System.out.println("thread is Interrupted");
			}System.out.println("thread:"+Thread.currentThread().getName()+"state:dead");
	}
}
public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		s1.start();
		s1.join();
		Sample s2=new Sample();
		s2.start();
	}
}
