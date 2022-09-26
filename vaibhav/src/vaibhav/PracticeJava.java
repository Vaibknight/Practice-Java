package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		p1.setColor("green");
		p2.setColor("blue");
		p1.setTip(45);
		System.out.println(p1.tip);

	}

}

class Pen {
	String color;
	int tip;
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	void setTip(int newTip) {
		tip = newTip;
	}
}
