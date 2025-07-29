package ecommerce.main;
import productmanagement.*;
import payment.*;
import java.util.Scanner;
import order.*;
public class ECommerceSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the customer ID:");
		int cusId=scan.nextInt();
		scan.nextLine();
		System.out.println("enter customer Name");
		String cusName=scan.nextLine();
		CustomerClass customer=new CustomerClass(cusId,cusName);
		System.out.println("\nChoose Product type(1. Electronics  2.Clothing):");
		int choice=scan.nextInt();
		ProductClass product=null;
		if(choice==1) {
			System.out.println("product ID:");
			int proId=scan.nextInt();
			scan.nextLine();
			System.out.println("product Name:");
			String proName=scan.nextLine();
			System.out.println("product Price");
			double proPrice=scan.nextDouble();
			product=new Electronics(proId, proName, proPrice);
		}
		else if(choice==2) {
			System.out.println("product ID:");
			int proId=scan.nextInt();
			scan.nextLine();
			System.out.println("product Name:");
			String proName=scan.nextLine();
			System.out.println("product price:");
			double proPrice=scan.nextDouble();
			product=new ClothingClass(proId,proName,proPrice);
		}
		else {
			System.out.println("invalid product choice");
			return;
		}
		System.out.println("\nSelect payment method");
		System.out.println("1. UPI\n2. Credit Card\n3. Cash on Delivery");
		int paymentChoice=scan.nextInt();
		PaymentMethod payment;
		switch (paymentChoice) {
		case 1: payment=new UPI();
		break;
		case 2: payment=new CreditCard();
		break;
		case 3: payment=new COD();
		break;
		default:
			System.out.println("invalid payment method");
			return;
		}
		double discountedPriced;
		if(product.price>1000)
		{
			discountedPriced=product.price*0.9;
		}
		else
		{
			discountedPriced=product.price-50;
		}
		Order order=new Order(product, customer, payment);
		order.processorder(discountedPriced);
	}
}
