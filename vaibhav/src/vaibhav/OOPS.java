package vaibhav;

import java.util.*;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mustang h1 = new Mustang();
//		Hierarchial inheritance

	}

}

abstract class Animal {
	
	
	String color;
	
	Animal(){
		System.out.println("Animal Connstructor is called");
	}
	
	
	
	
	void eat() {
		System.out.println(" Animals eat");
	}
	
	abstract void walk();
}


class Horse extends Animal{
	
	Horse(){
		System.out.println("Horse Connstructor is called");
	}
	
	void changeColor(){
		color = "Brown ";
	}
	
	void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

class Mustang extends Horse{
	
	Mustang(){
		System.out.println("Mustang Connstructor is called");
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