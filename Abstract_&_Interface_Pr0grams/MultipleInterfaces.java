package exceptiontask;
interface Printable{
	void print();
}
interface Scannable{
	void scan();
}
public class MultifunctionPrinter implements Printable,Scannable {
	public void print()
	{
		System.out.println("the machine is printing");
	}
	public void scan()
	{
		System.out.println("the machine is scanning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultifunctionPrinter m=new MultifunctionPrinter();
		m.print();
		m.scan();
	}
}
