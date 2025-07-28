package multithreadingtask;
class PriorityThread extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"running with priority"+Thread.currentThread().getPriority());
	}
}
public class Task5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
        PriorityThread t3=new PriorityThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
	}
}
