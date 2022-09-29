package vaibhav;

import java.util.*;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chicken c = new Chicken ();
		c.eat();
		c.walk();
		System.out.println(c.color);

	}

}

abstract class Animal {
	
	
	String color;
	
	Animal(){
		color ="Bluish ";
	}
	
	
	void eat() {
		System.out.println(" Animals eat");
	}
	
	abstract void walk();
}


class Horse extends Animal{
	
	void changeColor(){
		color = "Brown ";
	}
	
	void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

class Chicken extends Animal{
	
	void changeColor(){
		color = "White ";
	}
	
	void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}