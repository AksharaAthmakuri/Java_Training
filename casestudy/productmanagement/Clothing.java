package productmanagement;
public class ClothingClass extends ProductClass {
	public ClothingClass(int id,String name,double price) {
		super(id, name, price);
	}
	public void showDetails() {
		System.out.println("Clothing ID:"+id+"Name:"+name+"Price:"+price);
	}
}
