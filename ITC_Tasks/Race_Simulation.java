package multithreadingtask;
import java.util.Random;
class AnimalRunner implements Runnable {
    String name;
    public AnimalRunner(String name) {
        this.name = name;
        new Thread(this, name).start();
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": running..");
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Task11 {
    public static void main(String[] args) {
        new AnimalRunner("tortoise");
        new AnimalRunner("rabbit");
        new AnimalRunner("dog");
    }
}
