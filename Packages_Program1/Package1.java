package com.school.student;
public class Student {
	int id;
	String name;
	int age;
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("the id :"+id);
		System.out.println("the name :"+name);
		System.out.println("the age :"+age);
	}
}
