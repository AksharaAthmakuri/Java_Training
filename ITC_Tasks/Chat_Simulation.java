package multithreadingtask;
class ChatBox {
    boolean flag = false; // false means sender's turn, true means receiver's turn
    public synchronized void send(String msg) {
        while (flag) {
            try {
                wait(); // wait if it's receiver's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + msg);
        flag = true; // now it's receiver's turn
        notify();    // wake up receiver
    }
    public synchronized void receive(String msg) {
        while (!flag) {
            try {
                wait(); // wait if it's sender's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + msg);
        flag = false; // now it's sender's turn
        notify();     // wake up sender
    }
}
// Sender thread
class SenderTask implements Runnable {
    ChatBox chat;
    String[] messages = { "hi", "how are you?" };
    public SenderTask(ChatBox chat) {
        this.chat = chat;
        new Thread(this, "Sender").start();
    }
    public void run() {
        for (int i = 0; i < messages.length; i++) {
            chat.send(messages[i]);
        }
    }
}
// Receiver thread
class ReceiverTask implements Runnable {
    ChatBox chat;
    String[] replies = { "hello", "I'm fine" };
    public ReceiverTask(ChatBox chat) {
        this.chat = chat;
        new Thread(this, "Receiver").start();
    }
    public void run() {
        for (int i = 0; i < replies.length; i++) {
            chat.receive(replies[i]);
        }
    }
}
// Main class to start the simulation
public class Task10 {
    public static void main(String[] args) {
        ChatBox c = new ChatBox();
        new SenderTask(c);
        new ReceiverTask(c);
    }
}
