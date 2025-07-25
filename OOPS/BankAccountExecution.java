package javaoops_polymorphism;
public class Task3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookAccount b=new BookAccount();
		b.setAccountNumber(54753786);
		b.setBalance(5700.0);
		System.out.println(b.getAccountNumber()+"  "+b.getBalance());
		System.out.println(b);
	}
}
