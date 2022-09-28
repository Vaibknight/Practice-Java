package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		
		Deer d = new Deer() ;
		d.eat();
	}
	
}

class Animal {
	
	void eat() {
		System.out.println("eat mangoes");
	}
}

class Deer extends Animal {
	
	void eat() {
		System.out.println("eat grasses");
	}
}

class ar {
	
	
	int area (int l , int b) {
		return l * b;
	}
	
	float area(int a) {
		return a * a;
	}
}
