package exceptiontask;
class InvalidAccountException extends Exception{
	public InvalidAccountException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Task55 {
	static void checkBalance(int balance) throws InvalidAccountException{
		if(balance<0)
		{
			throw new InvalidAccountException("negative balance not allowed");
		}
		else {
			System.out.println("valid balance:"+balance);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkBalance(-10);
		}
		catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
	}
}
