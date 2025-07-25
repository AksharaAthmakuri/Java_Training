package com.shop.orders;
public class Orders {
	int or_id;
	public Orders(int or_id)
	{
		this.or_id=or_id;
	}
	public void display()
	{
		System.out.println("the order number is:"+or_id);
	}
}
