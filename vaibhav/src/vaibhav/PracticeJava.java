package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		p1.setColor("green");
		p2.setColor("blue");
		p1.setTip(99);
		p2.setTip(34);
		System.out.println(p1.getColor());
		System.out.println(p2.getColor());
		System.out.println(p1.getTip());
		System.out.println(p2.getTip());

	}

}

class Pen {
	private String color;
	private int tip;
	
	
	String getColor() {
		return this.color;
	}
	
	int getTip() {
		return this.tip;
	}
	void setColor(String newColor) {
		color = newColor;
	}
	
	void setTip(int newTip) {
		tip = newTip;
	}
}
