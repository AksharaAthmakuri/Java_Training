package scenariotask;
abstract class PaymentMethod{
	abstract void Pay(double amount);
	void paymentSuccess()
	{
		System.out.println("payment successful");
	}
}
class CreditCard extends PaymentMethod{
	public void Pay(double amount)
	{
		System.out.println("paying amount"+amount+"using credit card");
	}
}
class UPI extends PaymentMethod{
	public void Pay(double amount)
	{
		System.out.println("paying amount"+amount+"using UPI");
	}
}
class Cash extends PaymentMethod{
	public void Pay(double amount) {
		System.out.println("paying amount"+amount+"using cash");
	}
}
public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard c=new CreditCard();
		c.Pay(65000);
		c.paymentSuccess();
		UPI u=new UPI();
		u.Pay(54000);
		u.paymentSuccess();
		Cash c1=new Cash();
		c1.Pay(30000);
		c1.paymentSuccess();
	}
}
