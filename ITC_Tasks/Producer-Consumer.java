package multithreadingtask;
class Buffer {
    int item;
    boolean available = false;
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item = value;
        System.out.println("Produced: " + item);
        available = true;
        notify();
    }
    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}
class Producer implements Runnable {
    Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
        new Thread(this, "Producer").start();
    }
    public void run() {
        for (int i = 1; i <= 8; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        for (int i = 1; i <= 8; i++) {
            buffer.consume();
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Task9 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer);
        new Consumer(buffer);
    }
}
