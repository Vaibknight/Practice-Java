package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		
		Fish dolphin = new Fish();
		dolphin.eat();
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

class Fish extends Animal{
	
	int fin;
	
	void swim() {
		System.out.println("swim");
	}
}
