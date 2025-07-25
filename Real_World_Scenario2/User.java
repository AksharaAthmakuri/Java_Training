package com.shop.users;
public class User {
 int user_id;
 String user_name;
 public User(int user_id,String user_name)
 {
	 this.user_id=user_id;
	 this.user_name=user_name;
 }
 public void display()
 {
	 System.out.println("the user id is:"+user_id);
	 System.out.println("the user name is:"+user_name);
 }
}
