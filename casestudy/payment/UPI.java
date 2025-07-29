package payment;
public class UPI implements PaymentMethod {
	public void pay(double amount) {
		System.out.println("paid amount :"+amount+"via UPI");
	}
}
