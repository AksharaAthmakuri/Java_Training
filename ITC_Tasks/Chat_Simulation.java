package multithreadingtask;
class ChatBox {
    boolean flag = false; 
    public synchronized void send(String msg) {
        while (flag) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + msg);
        flag = true; 
        notify();    
    }
    public synchronized void receive(String msg) {
        while (!flag) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + msg);
        flag = false; 
        notify();     
    }
}

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

public class Task10 {
    public static void main(String[] args) {
        ChatBox c = new ChatBox();
        new SenderTask(c);
        new ReceiverTask(c);
    }
}
