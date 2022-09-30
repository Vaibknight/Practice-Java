package vaibhav;

import java.util.*;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bear b = new Bear();
		
		b.eats(); 
//		Multiple Inheritance by interface
		
		

	}

}

interface Carnivore{
	void eats();
}

interface Herbivore{
	void eats();
}

class Bear implements Carnivore, Herbivore{
	
	public void eats() {
		System.out.println("Bear is both carnivore and herbivore");
	}
}