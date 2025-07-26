package multithreadingtask;
class MyPrinterThread extends Thread{
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("thread is running");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("thread is Interrupted");
		}
	}
}
public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPrinterThread t=new MyPrinterThread();
		t.start();
	}
}
