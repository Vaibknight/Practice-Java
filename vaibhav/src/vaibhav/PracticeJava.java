package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		
		Bird sparrow = new Bird();
		sparrow.fly();
	}
	
}

class Animal {
	String color;
	
	
	void eat() {
		System.out.println("eat");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}

class Mammal extends Animal{
	
	int legs;
	
}

class Human extends Mammal{
	
	String Gender;
	
	void walk() {
		System.out.println("walk");
	}
}

class Fish extends Mammal{
	
	String Gender;
	
	void swim() {
		System.out.println("swim");
	}
}

class Bird extends Mammal{
	
	String Gender;
	
	void fly() {
		System.out.println("fly");
	}
}
