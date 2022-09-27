package vaibhav;

public class PracticeJava {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.Name = "Vaibhav";
		st.Roll = 4444;
		st.pass = "hh";
		System.out.println(st.Name+ " "+st.Roll);
		st.Marks[0] = 120;
		st.Marks[1] = 50;
		st.Marks[2] = 60;
		
		Student st2 = new Student(st);
		st.Marks [2] = 200;
		st2.pass = "ii";
		
		
		for(int i=0; i<3; i++) {
			System.out.println(st2.Marks[i]);
		}
		
	}
	
}

class Student {
	
	String Name;
	int Roll;
	String pass;
	int Marks[];
	
	Student(Student st){
		Marks  = new int[3];
		this.Name = st.Name;
		this.Roll = st.Roll;
		for(int i=0; i<3; i++) {
			this.Marks[i] = st.Marks[i];
		}
		
	}
	
	Student (){
		Marks  = new int[3];
		System.out.println("KKK");
		
	}
	
	Student(String Name){
		Marks  = new int[3];
		this.Name = Name;
	}
	
	Student(int Roll){
		Marks  = new int[3];
		this.Roll = Roll;
	}
	
}
