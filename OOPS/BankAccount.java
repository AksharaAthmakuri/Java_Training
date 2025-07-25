package javaoops_polymorphism;
public class BookAccount{
	private int accountNumber;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BookAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
