package order;
import productmanagement.*;
import payment.*;
public class Order {
	ProductClass product;
	CustomerClass customer;
	PaymentMethod paymentmethod;
	public Order(ProductClass product,CustomerClass customer,PaymentMethod paymentmethod)
	{
		this.product=product;
		this.customer=customer;
		this.paymentmethod=paymentmethod;
	}
	public void processorder(double discountedPriced)
	{
		System.out.println("customer :"+customer.CName);
		product.showDetails();
		System.out.println("DiscountedPrice:"+discountedPriced);
		paymentmethod.pay(discountedPriced);
		System.out.println("order placed sucessfully");
	}
}
