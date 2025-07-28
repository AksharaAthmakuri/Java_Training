package multithreadingtask;
class CountdownTask implements Runnable {
    public CountdownTask() {
        new Thread(this, "Countdown").start(); 
    }
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("time's up!");
    }
}
public class Task12 {
    public static void main(String[] args) {
        new CountdownTask();
    }
}
