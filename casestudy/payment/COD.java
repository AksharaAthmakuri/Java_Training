package payment;
public class COD implements PaymentMethod {
public void pay(double amount) {
		System.out.println("paid amount :"+amount+"via Cash on Delivery");
	}
}
