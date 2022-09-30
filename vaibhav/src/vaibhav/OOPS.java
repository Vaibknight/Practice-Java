package vaibhav;

import java.util.*;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.schoolName = "DPS";
		
		System.out.println(s1.schoolName);
		
		Student s2 = new Student();
		System.out.println(s2.schoolName);
		
		

	}

}

class Student {
	
	String name;
	int roll;
	
	static String schoolName;
	
	void setname(String name) {
		this.name=name;
	}
	
	String getname(){
		return this.name;
	}
}