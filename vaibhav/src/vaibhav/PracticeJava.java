package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.Name = "Vaibhav";
		st.Roll = 4444;
		System.out.println(st.Name+ " "+st.Roll);
		st.Marks[0] = 120;
		st.Marks[1] = 50;
		st.Marks[2] = 60;
		
		Student st2 = new Student(st);
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println(st.Marks[i]);
		}
	}
	
}

class Student {
	
	String Name;
	int Roll;
	String pass;
	int Marks[];
	
	Student(Student st2){
		Marks  = new int[3];
		this.Name = Name;
		this.Roll = Roll;
		
	}
	
	Student (){
		System.out.println("KKK");
		Marks  = new int[3];
	}
	
	Student(String Name){
		this.Name = Name;
		Marks  = new int[3];
	}
	
	Student(int Roll){
		this.Roll = Roll;
		Marks  = new int[3];
	}
	
}
