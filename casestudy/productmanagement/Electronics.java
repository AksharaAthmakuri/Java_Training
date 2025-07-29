package productmanagement;
public class Electronics extends ProductClass {
	public Electronics(int id,String name,double price) {
		super(id, name, price);
	}
	public void showDetails() {
		System.out.println("Electronic ID:"+id+"Name:"+name+"Price:"+price);
	}
}
