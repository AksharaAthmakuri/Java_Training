package shop;
import com.shop.products.*;
import com.shop.orders.*;
import com.shop.users.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(204,"Laptop");
		p.display();
		Orders o=new Orders(56);
		o.display();
		User u=new User(121,"john");
		u.display();
	}
}
