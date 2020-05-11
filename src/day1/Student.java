package day1;
//Inserting values in the variable


public class Student {
	
	String name;
	int id;
	int age;
	char grade;
	
	Student(String nam,int id,int age,char grade){
		this.name=nam;
		this.id=id;
		this.age=age;
		this.grade=grade;
		
		
	}
	/*void getvalue(String n,int i,int ag,char gr) {
		name=n;
		id=i;
		age=ag;
		grade=gr;
		
		
	}*/
	
	void display() {
		
		System.out.println(name+" "+id+" "+age+" "+grade);
		
	}
	

	public static void main(String[] args) {
		Student st =new Student("Ali",101,25,'A');
		/*st.name="Ali";
		st.id=1012;
		st.age=20;
		st.grade='A';*/
		//st.getvalue("Ali",101, 25,'A');
		st.display();
		
	}

}
