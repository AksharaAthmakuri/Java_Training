package productmanagement;
public abstract class ProductClass {
	public int id;
	public String name;
	public double price;
	public ProductClass(int i,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public abstract void showDetails();
}
