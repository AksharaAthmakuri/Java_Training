package com.shop.products;
public class Product {
	int pd_id;
	String pd_name;
	public Product(int pd_id,String pd_name)
	{
		this.pd_id=pd_id;
		this.pd_name=pd_name;
	}
	public void display()
	{
		System.out.println("product id:"+pd_id+"product name is:"+pd_name);
	}
}
