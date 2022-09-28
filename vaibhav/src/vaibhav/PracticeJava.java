package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		
		Human Vaib = new Human();
		Vaib.eat();
		Vaib.legs = 2;
		System.out.println(Vaib.legs);
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
}
