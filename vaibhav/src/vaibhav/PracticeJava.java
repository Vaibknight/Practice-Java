package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		
		ar st = new ar();
		
		System.out.println(st.area(34,56));
		System.out.println(st.area(39));
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
