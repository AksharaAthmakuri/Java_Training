package scenariotask;
class BankApp{
	double balance;
	public BankApp(double balance)
	{
		this.balance=balance;
	}
	public void checkBalance() throws Exception {
		if(balance<1000) {
			throw new Exception("MinimumBalanceException");
		}
		else {
			System.out.println("the balance in your account is:"+balance);
		}
	}
}
public class Task3 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BankApp b=new BankApp(1001);
		b.checkBalance();
	}
}
