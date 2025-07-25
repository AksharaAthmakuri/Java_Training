package javaoops_polymorphism;
import javax.sound.midi.SysexMessage;
class Animal{
	public void sound()
	{
		System.out.println("sound of animal");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("cat meow-meow");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("cow makes sound");
	}
}
public class Task7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();
		c.sound();
		Cow  c1=new Cow();
		c1.sound();
	}
}
