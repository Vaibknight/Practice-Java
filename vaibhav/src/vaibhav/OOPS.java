package vaibhav;

import java.util.*;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soldier s = new Soldier();
		
		s.walks();

	}

}


interface Chess{
	
	void walks();
}

class Queen implements Chess{
	
	public void walks() {
		System.out.println("Queen moves up, right, down, left & moves in all direction");
	}
}

class Elephent implements Chess{
	
	public void walks() {
		System.out.println("Elephant moves up, right, down, left");
	}
}

class Soldier implements Chess{
	
	public void walks() {
		System.out.println("Soldier moves up, right, down, left & moves in all direction");
	}
}