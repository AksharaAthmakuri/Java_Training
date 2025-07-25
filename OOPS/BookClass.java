package javaoops_polymorphism;
class Book{
	String title;
	String author;
	int price;
	Book(String title,String author,int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails()
	{
		System.out.println("the title is:"+title+"   "+"the author is :" +author+"   "+"the price is:"+price);
	}
}
public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("lifes amazing secrets","gaur gopal das",169);
		b.displayDetails();
	}
}
