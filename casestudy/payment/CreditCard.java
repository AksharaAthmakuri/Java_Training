package payment;
public class CreditCard implements PaymentMethod {
	public void pay(double amount) {
		System.out.println("paid amount :"+amount+"via CreditCard");
	}
}
