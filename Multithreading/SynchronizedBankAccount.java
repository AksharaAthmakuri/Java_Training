package multithreadingtask;
class BankAccount {
    int balance = 1000; 
    public synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is going to withdraw " + amount);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(user + " completed withdrawal, Remaining balance: " + balance);
        } else {
            System.out.println(user + " tried to withdraw " + amount + " but insufficient balance, Remaining balance: " + balance);
        }
    }
}
class WithdrawThread extends Thread {
    BankAccount account;
    String user;
    int amount;
    public WithdrawThread(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }
    public void run() {
        account.withdraw(amount, user);
    }
}
public class Task8 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        WithdrawThread t1 = new WithdrawThread(account, "User1", 700);
        WithdrawThread t2 = new WithdrawThread(account, "User2", 500);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception ex) {
            System.out.println("Exception occurred");
        }
        System.out.println("Final balance: " + account.balance);
    }
}
